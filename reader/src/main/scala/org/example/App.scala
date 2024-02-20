package org.example

import org.apache.spark.sql.SparkSession

object App {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("MinIOReader")
      .master("local[*]")
      .getOrCreate()

    println("Reader is running!")

    // Read the file from S3 bucket
    val data = spark.read.textFile("s3a://test/numbers.txt")

    // Print the content of the file
    data.collect().foreach(println)

    spark.stop()

    println("Reader is done!")
  }
}