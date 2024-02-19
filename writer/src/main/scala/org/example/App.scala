package org.example

import org.apache.spark.sql.SparkSession

object App {
  def main(args: Array[String]): Unit = {
    lazy val spark = SparkSession.builder()
      .appName("MinIOWriter")
      .master("local[*]")
      .getOrCreate()

    println("Writer is running!")
  }
}
