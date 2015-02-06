name := """uglifyTest"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  cache
)

//pipelineStages := Seq(uglify)
pipelineStages in Assets := Seq(uglify)
