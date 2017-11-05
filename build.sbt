enablePlugins(ScalaJSPlugin)

scalaVersion := "2.12.4"
name := "foo"
version := "0.1-SNAPSHOT"
libraryDependencies ++= Seq(
  "org.scalamock" %%% "scalamock-scalatest-support" % "3.6.0" % Test,
  "org.scalatest" %%% "scalatest" % "3.0.4" % Test
)


