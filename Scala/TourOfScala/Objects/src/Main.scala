object Main {
  def main(args: Array[String]): Unit = {
    val id = IDCreator.getID
    println(id)

    val cheesePizza: Pizza = Pizza.createPizza("cheese")
    val pepperoniPizza: Pizza = Pizza.createPizza("pepperoni")
    println(cheesePizza)
    println(pepperoniPizza)
  }
}
