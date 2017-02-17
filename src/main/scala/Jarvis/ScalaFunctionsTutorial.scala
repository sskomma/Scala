package Jarvis

/**
  * Created by rk027673 on 1/14/17.
  */
object ScalaFunctionsTutorial {
  def main(args: Array[String]): Unit ={

    println("Sum of 4 and 5 : " + getSum( 4, 5))

    sayHi()
    println("Sum of numbers from 4 to 9 : " + getSum( 4, 5, 6, 7, 8, 9))

    println("Factorial of 5: " + factorial(5))
  }

  /** Syntax of a function
    * def funcName( param1:dataType, param2: dataType) : returnType = {
    * function body
    * return <value> to return
    * }
    */
  def getSum(num1 : Int  = 1, num2 : Int = 1): Int =
  {
    return num1 + num2
  }

  /**
    *Functions that do not return a value are referred to as PROCEDURES
    *" : Unit " is equavelent to void in other languages..
   */
  def sayHi(): Unit ={
    println("Hello man")
  }

  /**
    * Scala can  multiple variables.
    */
  def getSum(args: Int*) : Int = {
    var sum : Int = 0
    for(num <- args){
      sum += num
    }
    return sum
  }

  /**
    * A recursive function.
    */
  def factorial(num: BigInt) : BigInt = {

    if( num <= 1)
      return 1
    else
      return num * factorial(num -1)
  }

}
