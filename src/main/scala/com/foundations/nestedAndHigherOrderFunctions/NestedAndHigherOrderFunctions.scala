package com.foundations.nestedAndHigherOrderFunctions

object NestedAndHigherOrderFunctions {

  def getCircleStats(radius: Double): (Double, Double) = {
    val PI = 3.14

    def getCircleArea(radius: Double) = PI * radius * radius

    def getCircleCircumference(radius: Double) = 2 * PI * radius

    (getCircleArea(radius), getCircleCircumference(radius))
  }

  def compareStringsAscending(s1: String, s2: String): Int = {
    if (s1 == s2) 0
    else if (s1 > s2) 1
    else {
      -1
    }
  }

  def compareStringsDescending(s1: String, s2: String): Int = {
    if (s1 == s2) 0
    else if (s1 > s2) -1
    else {
      1
    }
  }

  def smartCompare(s1: String, s2: String, cmpFn: (String, String) => Int): Int = {
    cmpFn(s1, s2)
  }

  def main(args: Array[String]): Unit = {
    println(getCircleStats(10))

    println(smartCompare("abc", "xyz", compareStringsAscending))
    println(smartCompare("abc", "xyz", compareStringsDescending))
  }
}