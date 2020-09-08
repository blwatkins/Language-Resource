object Main {
  def main(args: Array[String]): Unit = {
    val values: List[Int] = List(100, 200, 300, 400)
    val double: Int => Int = (x: Int) => x * 2

    def triple(x: Int): Int = {
      x * 3
    }

    val doubledValues = values.map(double)
    val tripledValues = values.map(triple)
    println(values)
    println(doubledValues)
    println(tripledValues)

    def math(value: Int, function: Int => Int): Int = {
      function(value)
    }

    def add4(x: Int): Int = {
      x + 4
    }

    println(math(75, add4))

    def getMultiplicationFunction(multiplier: Int): Int => Int = {
      (x: Int) => x * multiplier
    }

    val multiply7 = getMultiplicationFunction(7)
    println(multiply7(3))
  }
}
