package com.foundations.basic

object Loops {
  def main(args: Array[String]): Unit = {
    // For Loops
    val daysOfWeekList = List("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")
    for (day <- daysOfWeekList) {
      day match {
        case "Mon" => println("Manic Monday")
        case otherDay => println(otherDay)
      }
    }

    // for expression
    val x = for (day <- daysOfWeekList) yield {
      day match {
        case "Mon" => "Manic Monday"
        case otherDay => otherDay
      }
    }
    println(x)

    for (day <- daysOfWeekList if day == "Mon") {
      println("Manic Monday")
    }

    // While expressions
    var index = 0
    while (index < daysOfWeekList.size) {
      println(daysOfWeekList(index))
      index += 1
    }
  }
}
