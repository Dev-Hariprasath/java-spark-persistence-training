ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.6"
libraryDependencies += "com.typesafe.akka" %% "akka-actor-typed" % "2.6.21"

lazy val root = (project in file("."))
  .settings(
    name := "ScalaProject1"
  )
