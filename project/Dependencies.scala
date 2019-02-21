import sbt._
import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._

// Versions
object Version {
  val scala  = "2.12.8"
  val lspace = "0.5.0.0"
}

// Libraries
object Library {
  val lspaceClient        = Def.setting("eu.l-space" %%% "lspace-client" % Version.lspace)
  val lspaceParseArgonaut = Def.setting("eu.l-space" %%% "lspace-parse-argonaut" % Version.lspace)
  val lspaceServices      = "eu.l-space" %% "lspace-services" % Version.lspace

  val scalaTest = Def.setting("org.scalatest" %%% "scalatest" % "3.0.5" % "test")
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
          "org.scalatest" %% "scalatest" % "3.0.5" % "test"))
}
