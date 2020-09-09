object IDCreator {
  private var currentID: Int = 0

  def getID: Int = {
    currentID += 1
    currentID
  }
}
