package com.foundations.hello

object HelloTypes {

  case class Person( id: String )

  type MyIntegersToInteger = Int => Int

  val myFunction: MyIntegersToInteger = (n: Int) => { n * 2 }

  val myNumber: Int = 8
  //val myTuple1: (String, String) = ( String, String )
  //val myTuple2 = ( String, Int, Int, Boolean )

  def main(args: Array[String]): Unit = {

    val res1: Int = myNumber * 2
    val res2: Int = myNumber * myFunction(2)

    val converter: String => String = ( name ) => name.toUpperCase()
    val myFilter: String => Boolean = ( name ) => name.startsWith("A")
    
    val names: List[String] = List( "Ann", "Mary", "Jane" )
    val upperNames: List[String] = names.map( converter )

    val anotherList = names
      .filter( myFilter )
        .map( converter )

    upperNames.foreach( println )
    anotherList.foreach( println )

  }

}