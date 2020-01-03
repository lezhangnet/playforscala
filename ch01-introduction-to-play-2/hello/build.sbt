name := "hello"

version := "0.1"

scalaVersion := "2.12.10"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies += guice
