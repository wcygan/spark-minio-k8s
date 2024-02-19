package org.example

import org.apache.spark.sql.SparkSession

object App {
  def main(args: Array[String]): Unit = {
    lazy val spark = SparkSession.builder()
      .appName("MinIOReader")
      .master("local[*]")
      .getOrCreate()

    println("Reader is running")
  }
}
