package Jarvis

/**
  * Created by rk027673 on 1/15/17.
  */
object ScalaMapTutorial {
  def main (args: Array[String]): Unit ={

    // The following is a Mutable map, i.e
    // values in this map cannot be changed after they have been initialized
    val employees = Map("Manager" -> "Bob Smith",
    "Secretary" -> "Sue Brown")

    if(employees.contains("Manager"))
      printf("Manager : %s\n", employees("Manager"))
  }

  var customers = collection.mutable.Map(100 -> "Paul Smith",
    101 -> "Ram Komma")
  printf("Cust1 : %s\n", customers(100))
  customers(100) = "Jack Reacher"
  printf("Cust1 : %s\n", customers(100))
  customers(102) = "Megan Turner"
  for((k,v) <- customers){
    printf("%d : %s\n", k, v)
  }
}
