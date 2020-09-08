// Case Class

case class Book(title: String, author: String) {
  override def toString: String = {
    "BOOK: " + title + ", " + author
  }
}
