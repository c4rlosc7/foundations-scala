package com.foundations.basic

object Conditionals {
  def main(args: Array[String]): Unit = {
    // If and else expressions
    val numerator: Double = 22
    val denominator: Double = 7

    val res = if (denominator != 0) {
      numerator / denominator
    } else None

    val denominator2: Double = 7
    val res2 = if (denominator2 != 0) {
      numerator / denominator2
    }

    println(res)
    println(res2)
  }
}
