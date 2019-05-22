package com.foundations.basic

object PatternMatching {
  def main(args: Array[String]): Unit = {
    // Pattern Matching
    val dayOfWeek = "Saturday"
    val typeOfDay = dayOfWeek match {
      case "Monday" => "Manic Monday"
      case "Tuesday" | "Wednesday" | "Thursday" | "Friday" => "Other working day"
      case someOtherDay =>
        println(s"Some other day - neither Sunday nor Monday, its $someOtherDay")
        someOtherDay
      case someOtherDay if someOtherDay == "Saturday" => "Sizzing Saturday"
    }
    println(typeOfDay)

    // Pattern Matching on Type
    val circle: String = "10"
    val typeOfCircle = circle match {
      case circle: String => "String"
      case _ => "Any"
    }
    println(typeOfCircle)
  }
}
