import org.apache.spark.graphx.{Edge, Graph, VertexId}
import org.apache.spark.rdd.RDD
import org.apache.spark.sql.SparkSession

object SocialAnalysis {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("Social Analysis with GraphX")
      .master("local[*]")
      .getOrCreate()

    spark.sparkContext.setLogLevel("ERROR")

    val sc = spark.sparkContext

    // ---------------------------
    // Step 1: Create Vertices (Users)
    // ---------------------------

    val users: RDD[(VertexId, (String, String))] = sc.parallelize(Seq(
      (1L, ("Alice", "Student")),
      (2L, ("Bob", "Engineer")),
      (3L, ("Charlie", "Doctor")),
      (4L, ("David", "Engineer")),
      (5L, ("Emma", "Teacher"))
    ))

    // ---------------------------
    // Step 2: Create Edges (Relationships)
    // ---------------------------

    val relationship: RDD[Edge[String]] = sc.parallelize(Seq(
      Edge(1L, 2L, "friend"),
      Edge(2L, 3L, "colleague"),
      Edge(3L, 4L, "friend"),
      Edge(4L, 5L, "neighbor"),
      Edge(5L, 1L, "friend"),
      Edge(2L, 5L, "friend")
    ))


    // ---------------------------
    // Step 3: Create Graph
    // ---------------------------

    val graph = Graph(users, relationship)

    println("=== Graph Info ===")
    println(s"Total vertices: ${graph.numVertices}")
    println(s"Total edges: ${graph.numEdges}")

    val ranks = graph.pageRank(0.0001).vertices
    println("\n=== Page Rank (Influence Score) ===")
    users.join(ranks).collect.foreach{
      case (id, ((name, _), rank)) =>
        println(s"$name has influence score: $rank")
    }

    // ---------------------------
    // Step 5: Connected Components (Find Communities)
    // ---------------------------

    val communities = graph.connectedComponents().vertices

    println("\n === Connected Components (Communities) ===")
    users.join(communities).collect.foreach{
      case (id, ((name, _), comminityID)) =>
        println(s"$name is in community $comminityID")
    }

    // ---------------------------
    // Step 6: Triangle Counting (Measure Clustering)
    // ---------------------------

    val triangleCounts = graph.triangleCount().vertices
    println("\n === Triangle Count (Friend-of-a-Friend) ===")
    users.join(triangleCounts).collect.foreach {
      case (id, ((name, _), count)) =>
        println(s"$name is a part of $count triangles")
    }

    spark.stop()

  }
}
 