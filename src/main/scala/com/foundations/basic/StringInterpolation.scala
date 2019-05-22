package com.foundations.basic

object StringInterpolation {
  def main(args: Array[String]): Unit = {
    // String interpolation, immutable data, and expressions blocks
    val name = "Vitthal"
    val greeting = "Hello"
    println(s"$greeting $name, I hope you are having a great day!")
    println(s"${greeting * 2} $name, I hope you are having a great day!")

    val radius = 10
    val area = {
      val PI = 3.1
      println(s"Inside scope 1, PI=$PI");
      {
        val PI = 3.14
        println(s"Inside scope 2, PI=$PI")
        PI * radius * radius
      }
    }
    println(area)
  }
}
