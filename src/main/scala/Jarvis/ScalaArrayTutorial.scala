package Jarvis

import scala.collection.mutable.ArrayBuffer

/**
  * Created by rk027673 on 1/14/17.
  */
object ScalaArrayTutorial {
  def main(args : Array[String]): Unit ={

    val favNums = new Array[Int](10)
    val friends = Array("Bob", "Tom", "Sue")

    //ArrayBuffer. (No size given, because its size is variable)
    var friends2 = ArrayBuffer[String]()
    //Various ways to insert elements into ArrayBuffer
    friends2.insert(0, "Phil")

    friends2 += "Mark"

    friends2 ++= Array("Susy", "Paul")

    friends2.insert(1, "Mike", "Sally", "Sam",
      "Mary", "Sue")
    //removes 2 elements at index 1.
    friends2.remove(1, 2)

    for(frnd <- friends2){
      println(frnd)
    }

    for(i <- 0 until (favNums.length -1)){
      favNums(i) = i
    }
    val favNumsTimes2 = for(num <- favNums) yield 2*num

    favNumsTimes2.foreach(println)


    //Multi dimension array.
    var multiTable = Array.ofDim[Int](10,10)
    for(i <- 0 to 9) {
      for (j <- 0 to 9) {
        multiTable(i)(j) = i * j
        printf("%d : %d  = %d\n", i, j, multiTable(i)(j))
      }
    }

    //Sum of all elements in array
    println("Sum : " + favNums.sum)
    //Min of all elements
    println("Sum : " + favNums.min)
    //Max of all emements
    println("Sum : " + favNums.max)

    //Sort descending
    //To sort in ascending order use argument "_<_" in sortwith func.
    val sortedNums = favNums.sortWith(_>_)
    println("Printing Sorted elements")
    println(sortedNums.deep.mkString(", "))

    val friends3 = Array("Tom", "Mary", "Sue")
    println("Friends3 contains \"Tom\" "+friends3.contains("Tom"))
    println("Friends3 contains \"Mary\" "+friends3.contains("Mary"))

  }
}
