scalaVersion := "2.11.7"

libraryDependencies ++= {
  val akkaV = "2.3.14"
  val sprayV = "1.3.3"
  Seq(
    "io.spray"            %%  "spray-can"     % sprayV,
    "io.spray"            %%  "spray-routing" % sprayV,
    "io.spray"            %%  "spray-servlet" % "1.3.3",
    "io.spray"            %%  "spray-testkit" % sprayV  % "test",
    "com.typesafe.akka"   %%  "akka-actor"    % akkaV,
    "com.typesafe.akka"   %%  "akka-testkit"  % akkaV   % "test",
    "org.specs2"          %%  "specs2-core"   % "3.6.4" % "test"
  )
}

unmanagedSourceDirectories in Compile := Seq(baseDirectory.value / "src")

unmanagedResourceDirectories in Compile := Seq(baseDirectory.value / "conf")

sourceDirectory in webappPrepare :=  baseDirectory.value / "webapp"

enablePlugins(JettyPlugin)

Revolver.settings

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")
