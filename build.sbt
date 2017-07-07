name := """ram-bot"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.11"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  "org.postgresql" % "postgresql" % "9.4-1201-jdbc41",
  ws,
  filters,
  "org.scalatestplus.play" %% "scalatestplus-play" % "2.0.0" % Test
)

libraryDependencies <+= scalaVersion("org.scala-lang" % "scala-compiler" % _ )