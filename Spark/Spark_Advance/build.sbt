ThisBuild / scalaVersion := "2.13.12"
ThisBuild / version := "0.1.0-SNAPSHOT"

name := "Spark_Advance"

version := "0.1"

scalaVersion := "2.12.18"

lazy val root = (project in file("."))
  .settings(
    name := "Spark_Advance",
    version := "0.1",
    scalaVersion := "2.12.18", // Match with your Spark version
    libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-core" % "3.5.1",
      "org.apache.spark" %% "spark-sql" % "3.5.1",
    )
  )