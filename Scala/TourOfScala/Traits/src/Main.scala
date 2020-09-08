object Main {
  def main(args: Array[String]): Unit = {
    val pets: List[Pet] = List(
      new Cat("Mittens"),
      new Dog("Spot")
    )

    pets.foreach(pet => pet.bePet())
  }
}
