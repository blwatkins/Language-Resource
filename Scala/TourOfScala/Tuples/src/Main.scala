object Main {
  def main(args: Array[String]): Unit = {
    // Creating a tuple
    val myTuple = ("birds", 15)
    println(myTuple)

    // Accessing Tuple Values
    println(myTuple._1)
    println(myTuple._2)

    // Pattern Matching
    val (pet, count) = myTuple
    println(pet)
    println(count)
  }
}
