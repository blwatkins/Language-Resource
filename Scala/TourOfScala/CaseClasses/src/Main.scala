object Main {
  def main(args: Array[String]): Unit = {
    val prideAndPrejudice = Book("Pride and Prejudice", "Jane Austen")
    val pride = Book("Pride and Prejudice", "Jane Austen")
    val frankenstein = Book("Frankenstein", "Mary Shelley")
    println(frankenstein)
    println(prideAndPrejudice == pride)
    println(prideAndPrejudice == frankenstein)
  }
}
