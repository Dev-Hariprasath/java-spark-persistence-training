package com.realtimeAnalytics

import org.apache.spark.ml.Pipeline
import org.apache.spark.ml.classification.LogisticRegression
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.sql.SparkSession

object TrainOfflineModel {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("TrainOfflineModel")
      .master("local[*]")
      .getOrCreate()

    spark.sparkContext.setLogLevel("WARN")

    import spark.implicits._

    val trainDF = Seq(
      ("u1", 0.5, 1.2, -0.3, 1.0),
      ("u2", 1.1, -0.2, 0.8, 0.0),
      ("u3", -0.7, 0.4, 0.9, 1.0)
    ).toDF("userId", "f1", "f2", "f3", "label")


    val assembler = new VectorAssembler()
      .setInputCols(Array("f1", "f2", "f3"))
      .setOutputCol("features")

    val lr = new LogisticRegression()
      .setLabelCol("label")
      .setFeaturesCol("features")

    val pipeline = new Pipeline()
      .setStages(Array(assembler, lr))

    val model = pipeline.fit(trainDF)


    model.write.overwrite().save("models/lr-pipeline")

    println("Model trained and saved to model/lr-pipeline")
  }
}
