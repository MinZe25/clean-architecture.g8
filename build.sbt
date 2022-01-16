enablePlugins(ScriptedPlugin)
lazy val scala213 = "2.13.7"
lazy val scala212 = "2.12.15"
lazy val scala211 = "2.11.12"

ThisBuild / scalaVersion := scala213
ThisBuild / useSuperShell := false
ThisBuild / autoStartServer := false

name := "Clean Architecture Template"

addCommandAlias("test", "g8Test")

scriptedLaunchOpts ++= Seq(
  "-Xms1024m",
  "-Xmx1024m",
  "-XX:ReservedCodeCacheSize=128m",
  "-Xss2m",
  "-Dfile.encoding=UTF-8"
)
