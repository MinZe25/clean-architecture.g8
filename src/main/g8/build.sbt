ThisBuild / version       := "0.0.1-SNAPSHOT"
ThisBuild / organization  := "$organization;format="lower,package"$"
ThisBuild / scalaVersion  := "$scala_version$"
ThisBuild / useSuperShell := false

lazy val `$name;format="norm"$` =
  project
    .in(file("."))
    .aggregate( domain, application, persistence, rest)
    .settings(
      name := "$name$"
    )

addCommandAlias("run", "main/run")

lazy val domain =
  project
    .in(file("domain"))


lazy val application =
  project
    .in(file("application"))
    .dependsOn(domain % oneToOneClasspathDependencies)

lazy val persistence =
  project
    .in(file("persistence"))
    .dependsOn(domain % oneToOneClasspathDependencies)

lazy val rest =
  project
    .in(file("rest"))
    .enablePlugins(PlayScala)
    .dependsOn(application % oneToOneClasspathDependencies)
    .dependsOn(persistence % oneToOneClasspathDependencies)

lazy val oneToOneClasspathDependencies: String =
  "compile->compile;test->test"

addCommandAlias("gen", "$name;format="norm"$/g8Scaffold")

onLoadMessage +=
  s"""
\nRun \${green("gen usecase")} to generate new use cases.\n
\nRun \${green("gen entity")} to generate new entities.\n
  """


def green(input: Any): String =
  scala.Console.GREEN + input + scala.Console.RESET
