import sbt._
import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._

// Versions
object Version {
  val scala  = "2.12.8"
  val lspace = "0.6.0.0-M2"
}

// Libraries
object Library {
  val lspaceClient        = Def.setting("eu.l-space" %%% "lspace-client" % Version.lspace)
  val lspaceParseArgonaut = Def.setting("eu.l-space" %%% "lspace-parse-argonaut" % Version.lspace)
  val lspaceServices      = "eu.l-space" %% "lspace-services" % Version.lspace

  val scalaTest = Def.setting("org.scalatest" %%% "scalatest" % "3.0.7" % "test")
}

object Dependencies {
  import Library._

  val nsDeps = Def.setting(Seq(lspaceClient.value, scalaTest.value))

  val nsJsDeps = Def.setting(Seq())

  val nsJvmDeps = Seq()

  val nsServiceDeps =
    Def.setting(
      Seq(lspaceServices,
          lspaceClient.value,
          lspaceParseArgonaut.value,
          "org.scalatest" %% "scalatest" % "3.0.7" % "test"))

  val nsGenDeps =
    Def.setting(
      Seq(lspaceParseArgonaut.value, Def.setting("org.scalameta" %%% "scalameta" % "4.1.5").value, scalaTest.value))
}