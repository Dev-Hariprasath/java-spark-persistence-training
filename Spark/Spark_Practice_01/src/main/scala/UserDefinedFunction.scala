import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.udf

object UserDefinedFunction {
  def main(args: Array[String]) : Unit = {

    // Create the Spark Session
    val spark = SparkSession.builder()
      .appName("User Defined Function")
      .master("local[*]")
      .getOrCreate()

    //Import the implicits After creating the session
    import spark.implicits._

    val sc = spark.sparkContext
    sc.setLogLevel("WARN")

    //Create Data Frame
    val dataFrame = Seq("Hari", "Prasath", "Maran", "Mogan").toDF("name")

    // Create UDF
    def toupperCase(str: String): String = {
      if(str != null) str.toUpperCase else null
    }

    //Register UDF
    val UpperUDF = udf(toupperCase _)

    //Apply UDF
    val resultDataFrame = dataFrame.withColumn("upper_name", UpperUDF($"name"))

    resultDataFrame.show()
  }
}