package Jarvis

/**
  * Created by rk027673 on 1/15/17.
  */
object ScalaClassTutorial {

  def main(args: Array[String]): Unit ={

    val rover = new Animal
    rover.setName("Rover")
    rover.setSound("Woof")
    printf("%s says %s\n", rover.getName(), rover.getSound())

    val whiskers = new Animal("Whiskers", "Meow")
    println(s"${whiskers.getName()} with id ${whiskers.id} says ${whiskers.getSound()}")
    println(whiskers.toString())

    val spike = new Dog("Spike", "Woof", "Grrrr")
    spike.setName("Spike")
    println(spike.toString())
  } // End of MAIN

  class Animal(var name: String, var sound: String) {
    this.setName(name)

    val id = Animal.newIdNum
    def getName(): String = name
    def getSound(): String = sound

    def setName(name: String): Unit ={
      if(!(name.matches(".*\\d+.*")))
        this.name = name
      else
        this.name = "No Name"
    }

    def setSound(sound: String): Unit ={
      this.sound = sound
    }
    // Other constructors.
    def this(name: String){
      this("No Name", "No Sound")
      this.setName(name)
    }

    //Other Constructors
    def this(){
      this("No Name", "No Sound")
    }

    //Override ToString method of an object.
    override def toString(): String = {
      return "%s with the id %d says %s"
          .format(this.name, this.id, this.sound)
    }
  }

  object Animal {
    private var idNumber = 0
    private def newIdNum = {idNumber += 1; idNumber}
  }

  class Dog(name: String, sound: String, growl : String) extends Animal(name, sound){
    def this(name: String, sound: String){
      this("No Name", sound, "No Growl")
      this.setName(name)
    }

    def this (name: String){
      this("No Name", "No Sound", "No Growl")
      this.setName(name)
    }

    def this(){
      this("No Name", "No Sound", "No Growl")
    }

    override def toString(): String ={
      return "%s with the id %d says %s or %s"
          .format(this.name, this.id, this.sound, this.growl)
    }
  }

} // END of ScalaClassTutorial