import sbt._
import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._

// Versions
object Version {
  val scala  = "2.12.8"
  val lspace = "0.3.0.0-M2+3-b89e77b6-SNAPSHOT"
}

// Libraries
object Library {
  val lspaceCore     = Def.setting("eu.l-space" %%% "lspace-client" % Version.lspace)
  val lspaceServices = "eu.l-space" %% "lspace-services" % Version.lspace

  val scalaTest = Def.setting("org.scalatest" %%% "scalatest" % "3.0.5" % "test")
}

object Dependencies {
  import Library._

  val nsDeps = Def.setting(Seq(lspaceCore.value, scalaTest.value))

  val nsJsDeps = Def.setting(Seq())

  val nsJvmDeps = Seq()

  val nsServiceDeps = Seq(lspaceServices, "org.scalatest" %% "scalatest" % "3.0.5" % "test")
}
