package Jarvis

/**
  * Created by rk027673 on 1/14/17.
  */
object ScalaStringsTutorial {
  def main (args: Array[String]): Unit ={
   stringFunA()
  }

  def stringFunA(): Unit ={
    var randSentance = "I saw a dragon fly by"

    //Get an character at an index.
    println("Char at 3rd Index: " + randSentance(3))

    //Get length of a string
    println("String length: " + randSentance.length)

    //Concat Sentance
    println(randSentance.concat(" and explode"))

    //Compare strings
    println("Are strings equal: " + "I saw a dragon".equals(randSentance))

    //Find a word
    println("Dragon starts at index: " +
    randSentance.indexOf("dragon"))
  }
}
