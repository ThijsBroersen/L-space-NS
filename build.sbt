import Dependencies._
import com.typesafe.sbt.packager.docker.Cmd
// shadow sbt-scalajs' crossProject and CrossType until Scala.js 1.0.0 is released
import sbtcrossproject.CrossPlugin.autoImport.{crossProject, CrossType}

ThisBuild / organization := "eu.l-space"
ThisBuild / scalaVersion := "2.12.8"

lazy val settings = commonSettings

lazy val compilerOptions = Seq(
  "-unchecked",
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-language:postfixOps",
  "-language:reflectiveCalls",
  "-deprecation",
  "-encoding",
  "utf8"
)

lazy val projectSettings = Seq(
  organization := "eu.l-space",
  homepage := Some(url("https://github.com/L-space/L-space-NS")),
  licenses := List("MIT" -> url("https://opensource.org/licenses/MIT")),
  developers := List(
    Developer(
      "thijsbroersen",
      "Thijs Broersen",
      "thijsbroersen@gmail.com",
      url("https://github.com/ThijsBroersen")
    )
  )
)

lazy val commonSettings = projectSettings ++ Seq(
  scalacOptions ++= compilerOptions,
  crossScalaVersions := Seq("2.11.12", "2.12.8"),
  publishArtifact in (Test, packageBin) := true,
  updateOptions := updateOptions.value.withCachedResolution(true)
)

val dirtyEnd = """(\+\d\d\d\d\d\d\d\d-\d\d\d\d)-SNAPSHOT$""".r
def stripTime(version: String) = dirtyEnd.findFirstIn(version) match {
  case Some(end) => version.stripSuffix(end) + "-SNAPSHOT"
  case None => version
}

ThisBuild / version ~= stripTime
ThisBuild / dynver ~= stripTime

lazy val LspaceNS = project
  .in(file("."))
  .settings(skip in publish := true)
  .aggregate(ns.jvm, ns.js)

lazy val ns = (crossProject(JSPlatform, JVMPlatform)
  .withoutSuffixFor(JVMPlatform)
  .crossType(CrossType.Full) in file("ns"))
  .settings(settings)
  .settings(
    name := "lspace-ns",
    libraryDependencies ++= nsDeps.value
  )
  .jvmSettings(
    libraryDependencies ++= nsJvmDeps
  )
  .jsSettings(
    jsEnv in Test := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv(),
    libraryDependencies ++= nsJsDeps.value
  )

lazy val nsService = project.in(file("ns-service"))
  .enablePlugins(DockerPlugin).enablePlugins(JDKPackagerPlugin)
  .dependsOn(ns.jvm)
  .settings(settings)
  .settings(
    name := "lspace-ns-service",
    libraryDependencies ++= nsServiceDeps,
    topLevelDirectory := None, // Don't add a root folder to the archive
    dockerBaseImage := "openjdk:8-jre-alpine",
    dockerExposedPorts := Seq(8080),
    dockerCommands ++= Seq(
      Cmd("User", "root"),
      Cmd("RUN", "apk", "add", "--no-cache", "bash"),
      Cmd("User", "daemon")
    ),
    dockerUsername := Some("lspace"),
    packageName in Docker := name.value,
    version in Docker := version.value
  )

val makeSettingsYml = Def.task {
  val file     = (resourceManaged in Compile).value / "site" / "data" / "settings.yml"
  val contents = s"version: ${version.value}"
  IO.write(file, contents)
  Seq(file)
}

lazy val site = (project in file("site"))
  .enablePlugins(MicrositesPlugin)
  .dependsOn(ns.jvm % "compile->compile;compile->test")
  .settings(name := "lspace-ns-site")
  .settings(skip in publish := true)
  .settings(projectSettings)
  .settings(
    resourceGenerators in Compile += makeSettingsYml.taskValue,
    makeMicrosite := (makeMicrosite dependsOn makeSettingsYml).value
  )
  .settings(
    micrositeName := "L-space-NS",
    micrositeDescription := "L-space-NS, a semantic schema repository",
    micrositeDataDirectory := (resourceManaged in Compile).value / "site" / "data",
    //    unmanagedResources ++= Seq(
    //
    //    ),
    //    micrositeDocumentationUrl := "/yoursite/docs",
    //    micrositeDocumentationLabelDescription := "Documentation",
    micrositeAuthor := "Thijs Broersen",
    micrositeHomepage := "https://docs.ns.l-space.eu",
    micrositeOrganizationHomepage := "https://ns.l-space.eu",
    //    micrositeOrganizationHomepage := "",
    excludeFilter in ghpagesCleanSite := //preserves github-settings for custom domain, each time CNAME is written custom domain is reset?
      new FileFilter{
        def accept(f: File) = (ghpagesRepository.value / "CNAME").getCanonicalPath == f.getCanonicalPath
      } || "versions.html",
    micrositeGithubOwner := "L-space",
    micrositeGithubRepo := "L-space-NS",
    micrositeGitterChannelUrl := "L-space/L-space-NS",
    micrositeFooterText := Some(
      "<b>Knowledge is Power</b> <- <i>BOOKS = KNOWLEDGE = POWER = (FORCE X DISTANCE ÷ TIME)</i>")
  )
