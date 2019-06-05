import sbt._

object Dependencies {
  lazy val scalafixCore = "ch.epfl.scala" %% "scalafix-core" % "0.9.5"
  lazy val scalafixRules = "ch.epfl.scala" %% "scalafix-rules" % "0.9.5"
  lazy val scalafixReflect = "ch.epfl.scala" % "scalafix-reflect" % "0.9.5" cross CrossVersion.full
  lazy val scaluzzi = "com.github.vovapolu" %% "scaluzzi" % "0.1.2"
  lazy val coursierSmall = "com.geirsson" %% "coursier-small" % "1.3.3"
}
