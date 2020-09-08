// Unified Types

object Main {
  def main(args: Array[String]): Unit = {
    // Types
    val list: List[Any] = List(
      "my string", // String
      730, // Int
      'p', // Char
      false, // Boolean
      () => "a function returning a string" // Function
    )

    list.foreach(element => println(element))

    // Casting
    val integer: Int = 45
    val float: Float = integer
    println(float)
  }
}
