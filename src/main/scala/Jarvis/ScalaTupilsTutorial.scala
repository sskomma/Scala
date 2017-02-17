package Jarvis

/**
  * Created by rk027673 on 1/15/17.
  */
object ScalaTupilsTutorial {
  def main(args: Array[String]): Unit ={
    //Tupils are normally immutable. Can hold various values.
    var tupleMarge = (103, "Marge Simpson", 10.25)
    printf("%s owes you $%.2f\n", tupleMarge._2, tupleMarge._3)
    tupleMarge.productIterator.foreach{i => println(i)}

    println(tupleMarge.toString())
  }
}
