// Scala Class
// Private members with getters and setters

class Point {
  private var _x: Int = 0
  private var _y: Int = 0

  // Getters
  def x: Int = {
    _x
  }

  def y: Int = {
    _y
  }

  // Setters
  def x_= (newX: Int): Unit = {
    _x = newX
  }

  def y_= (newY: Int): Unit = {
    _y = newY
  }

  override def toString: String = {
    "(" + _x + ", " + _y + ")"
  }
}
