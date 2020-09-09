sealed abstract class Pizza

class CheesePizza extends Pizza

class PepperoniPizza extends Pizza

object Pizza {

  def createPizza(pizzaType: String): Pizza = {
    var pizza: Pizza = null

    pizzaType match {
      case "cheese" => pizza = new CheesePizza
      case "pepperoni" => pizza = new PepperoniPizza
      case _ => pizza = new CheesePizza
    }

    pizza
  }

}
