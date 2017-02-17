package Jarvis

import scala.io.StdIn

/**
  * Created by rk027673 on 1/14/17.
  *
  * This object deals with IO inside scala
  */
object ScalaIOTutorial {
  def main(args : Array[String]){
    //io1()
    io2()
  }

  def io2(): Unit ={
    val name = "RamKomma"
    val age = 29
    val weight = 175.09
    println(s"Hello $name")
    println(f"I am ${age + 1} and weight $weight%.2f")

    //Right Justified
    printf("'%5d'\n", 5)

    //Left Justified
    printf("'%-5d'\n", 5)

    //Fill 0's.
    printf("'%05d'\n", 5)

    //Print 5 decimal places.
    printf("'%5f'\n", 3.14)

    //Justification can also be used for strings
    printf("'%5s'\n", "hi")

  }

  def io1(): Unit ={
    var numberGuess = 0
    do{
      print("Guess our Secret number: ")
      /*The following is an other way to read,
      but is deprecated in favor of StdIn package

      numberGuess = readLine.toInt */
      numberGuess = StdIn.readInt()
    } while (numberGuess != 15)
    printf("You guessed the secret number %d\n", 15)
  }
}
