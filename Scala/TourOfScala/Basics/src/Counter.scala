// Scala Object

object Counter {
  private var counter: Int = 0

  def getNext: Int = {
    counter += 1
    counter
  }
}
