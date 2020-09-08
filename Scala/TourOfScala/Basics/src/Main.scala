// Single-line Comment

object Main {
  def main(args: Array[String]): Unit = {
    // Expressions
    println(1 + 1)
    println("Hello " + "there!")

    // Values
    val value = 10
    println(value)

    // Variables
    var variable = 15
    variable = 20
    println(variable)

    // Blocks
    println({
      val x = 1 * 10
      x * 9
    })

    // Functions
    val add = (x: Int, y:Int) => x + y
    println(add(45, 60))

    val sayHi = () => println("Hi!")
    sayHi()

    // Methods
    def add3(x: Int): Int = {
      x + 3
    }

    println(add3(40))

    def sayHello(): Unit = {
      println("Hello!")
    }

    sayHello()

    // Class Instances
    val greeting = new Greeting("Bob")
    greeting.greet()

    // Using an Object
    val count = Counter.getNext
    println(count)
  }
}
