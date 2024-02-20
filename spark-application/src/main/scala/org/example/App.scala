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
    val numbers = (0 to 100).toList

    // Convert the list to a DataFrame
    val df = numbers.toDF()

    // Filter the DataFrame to only contain odd numbers
    val oddNumbers = df.filter($"value" % 2 === 1)

    // Count the number of odd numbers
    val count = oddNumbers.count()

    println(s"The number of odd integers is $count")

    // Stop the SparkSession
    spark.stop()

    println("OddNumbersCounter is done!")
  }
}