package org.example

import org.apache.spark.sql.SparkSession

object App {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("MinIOWriter")
      .master("local[*]")
      .getOrCreate()

    println("Writer is running!")

    val numbers = spark.sparkContext.parallelize(0 to 100)
    numbers.saveAsTextFile("s3a://test/numbers.txt")

    spark.stop()

    println("Writer is done!")
  }
}