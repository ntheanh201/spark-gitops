package com.viettel.dslab

import org.apache.spark.sql.SparkSession

object Main {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder.appName("spark-gitops").config("spark.master", "local[*]").getOrCreate();
    val data = Seq(("James", "Smith", "1991-04-01", "M", 3000))
    val columns = Seq("firstName", "lastName", "dob", "gender", "salary")
    val df = spark.createDataFrame(data).toDF(columns: _*)
    df.show()
  }
}
