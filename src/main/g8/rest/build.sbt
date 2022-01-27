libraryDependencies += guice
scalacOptions ++= Seq(
  "-feature", // Show warning feature details in the console
  "-language:reflectiveCalls"
) // Enable routes file splitting
libraryDependencies ++= Seq(
  "com.github.dwickern" %% "swagger-play2.8" % "3.1.0",
  "io.swagger" % "swagger-core" % "1.6.4",
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.13.1",
  "io.github.minze25" %% "scala-mediator" % "0.6.0"
)
libraryDependencies += "org.webjars" % "swagger-ui" % "4.1.3"
lazy val oneToOneClasspathDependencies: String =
  "compile->compile;test->test;optional"
lazy val persistence =
  project
    .in(file("../persistence"))
lazy val application =
  project
    .in(file("../application"))

lazy val root =
  project
    .in(file("."))
    .withId("rest")
    .enablePlugins(PlayScala)
    .aggregate(persistence)
    // Aggregate the persistence project only because persistence already aggregates the application project
    .dependsOn(persistence % oneToOneClasspathDependencies)
    .dependsOn(application % oneToOneClasspathDependencies)
