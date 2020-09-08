// Scala Class
// Constructor arguments are accessible as class members

class Person(var name: String, val id: Int) {
  def sayHello: Unit = {
    println("Hello, " + name)
  }

  override def toString: String = {
    "PERSON: " + name + ", " + id
  }
}
