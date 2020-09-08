object Main {
  def main(args: Array[String]): Unit = {
    val point = new Point
    point.x = 17
    point.y = 15
    println(point.x)
    println(point.y)
    println(point)

    // can access constructor parameters as class members
    // cannot modify id because it's declared as a val
    val person = new Person("Sally", 100)
    person.name = "Brenda"
    person.sayHello
    println(person.name)
    println(person.id)
    println(person)

    // cannot access constructor parameters as class members
    val dog = new Dog("Spot", 3)
    println(dog)
  }
}
