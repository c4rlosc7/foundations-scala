package com.foundations.hello
import com.typesafe.config.{ Config, ConfigFactory }

object HelloConfig {

  def main( args: Array[String] ): Unit = {

    val config: Config = ConfigFactory.load()
    val msg: String = config.getString( "greeting.msg" )

    println( msg )
  }

}
