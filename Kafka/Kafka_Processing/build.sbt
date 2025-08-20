ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.18"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.5.1",
  "org.apache.spark" %% "spark-sql" % "3.5.1",
  "org.apache.hadoop" % "hadoop-client" % "3.3.6",
  "org.apache.spark" %% "spark-sql-kafka-0-10" % "3.5.1"
)
lazy val root = (project in file("."))
  .settings(
    name := "Kafka_Processing"
  )
