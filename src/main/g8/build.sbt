ThisBuild / version       := "0.0.1-SNAPSHOT"
ThisBuild / organization  := "$organization;format="lower,package"$"
ThisBuild / scalaVersion  := "$scala_version$"
ThisBuild / useSuperShell := false

lazy val root =
  project
    .in(file("."))
    .withId("$name;format="norm"$")
    .aggregate(rest)
    .settings(
      name := "$name$"
    )

addCommandAlias("run", "rest/run")

lazy val rest =
  project
    .in(file("rest"))

lazy val oneToOneClasspathDependencies: String =
  "compile->compile;test->test;optional" // adding the optional tag so rest doesn't depend on domain

addCommandAlias("gen", "$name;format="norm"$/g8Scaffold")

onLoadMessage +=
  s"""
\nRun \${green("gen usecase")} to generate new use cases.\n
\nRun \${green("gen entity")} to generate new entities.\n
  """


def green(input: Any): String =
  scala.Console.GREEN + input + scala.Console.RESET
