libraryDependencies ++= Seq(
  "io.github.minze25" %% "scala-mediator" % "0.6.0"
)
lazy val oneToOneClasspathDependencies: String =
  "compile->compile;test->test;optional"
lazy val domain =
  project
    .in(file("../domain"))

lazy val root =
  project
    .in(file("."))
    .withId("application")
    .aggregate(domain)
    .dependsOn(domain % oneToOneClasspathDependencies)
