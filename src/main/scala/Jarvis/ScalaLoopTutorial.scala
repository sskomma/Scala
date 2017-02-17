package Jarvis

/**
  * Created by rk027673 on 1/14/17.
  * This Object deals with looping inside scala.
  */
object ScalaLoopTutorial {
  def main(args: Array[String]) {
    //using a While Loop
    var i = 0
    while(i<=10) {
      println(i)
      i += 1
    }

    //Using a For loop
    var j  = 0
    val randLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    for(j <- 0 until randLetters.length)
    {
      println(randLetters(j))
    }

    // For each loop
    var k = 0
    val aList = List(1,2,3,4,5)
    for(k <- aList)
      println("List Items " + k)

    //For loop with a condition
    var l = 0
    var eventlist = for{ l <- 0 to 20
      if(l %2) == 0
    } yield  l

    for(l <- eventlist)
      println("Even List " + l)

    //Nested loop.
    for(m <- 1 to 5 ; n <- 6 to 10)
    {
      println("m: " +  m + " n: " + n)
    }

  }
}
