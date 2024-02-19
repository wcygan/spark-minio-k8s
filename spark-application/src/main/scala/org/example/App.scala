package org.example

import org.apache.spark.sql.SparkSession

object App {
  def main(args: Array[String]): Unit = {
    // Initialize SparkSession
    val spark = SparkSession
      .builder()
      .appName("OddNumbersCounter")
      .getOrCreate();

    import spark.implicits._

    // Create a list of integers
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)

    // Convert the list to a DataFrame
    val df = numbers.toDF()

    // Filter the DataFrame to only contain odd numbers
    val oddNumbers = df.filter($"value" % 2 === 1)

    // Count the number of odd numbers
    val count = oddNumbers.count()

    println(s"The number of odd integers is $count")

    // Stop the SparkSession
    spark.stop()
  }
}