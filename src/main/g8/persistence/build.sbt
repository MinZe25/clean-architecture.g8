lazy val oneToOneClasspathDependencies: String =
  "compile->compile;test->test;optional"
lazy val application =
  project
    .in(file("../application"))

lazy val root =
  project
    .in(file("."))
    .withId("persistence")
    .aggregate(application)
    .dependsOn(application % oneToOneClasspathDependencies)