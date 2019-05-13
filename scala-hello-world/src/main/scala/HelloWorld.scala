object HelloWorld {

  val names: List[String] = List( "hugo", "paco", "lucho" )

  val testTuple: (String, String) = ( "Hello", "Moto" )

  val keyValue: (String, Double) = ( "Hello", 20D )

  def toUpper( name: String ): String = {
    name.toUpperCase
  }

  val moreNames1: List[String] = names.map( toUpper )

  val moreNames2: List[String] = names.map( name => name.toUpperCase )

  val lengths: List[Int] = names.map(name => name.length )

  val namesAndLengths: List[(String, Int)] = names.map(name => ( name, name.length ) )

  def main(args: Array[String]): Unit = {

    println( "Hello everyone!!!" )

    names.foreach( name => println( "My name is: " + name ) )

    moreNames1.foreach( name => println( s"My name is: $name"  ) )

    moreNames2.foreach( name => println( s"My name is: $name"  ) )

    lengths.foreach( l => println( s"My name's length is: $l"  ) )

    namesAndLengths.foreach( myTuple => println( "Name: " + myTuple._1 + ", length: " + myTuple._2 ) )

    namesAndLengths.foreach( myTuple => println( s"Name: ${myTuple._1} , length: ${myTuple._2}") )

  }
}
