ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.18"


libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.5.0",
  "org.apache.spark" %% "spark-sql" % "3.5.0",
  "org.scalaj" %% "scalaj-http" % "2.4.2"
)

lazy val root = (project in file("."))
  .settings(
    name := "Spark_Project"
  )
