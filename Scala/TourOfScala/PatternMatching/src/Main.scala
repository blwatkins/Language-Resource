object Main {
  def main(args: Array[String]): Unit = {

    def printNumber(x: Int): Unit = x match{
      case 1 => println("one")
      case 2 => println("two")
      case 3 => println("three")
      case _ => println("number")
    }

    printNumber(3)
    printNumber(15)

    def getNotification(message: Message): String = {
      var notification = "You have "

      message match {
        case e: Email => notification += "an email "
        case t: Text => notification += "a text "
        case v: Voicemail => notification += "a voicemail message "
      }

      notification += "from " + message.from
      notification
    }

    val email = Email("Mom", "Cat Parade", "There's a cat parade today!")
    val voicemail = Voicemail("Dad", "Love you!")
    println(getNotification(email))
    println(getNotification(voicemail))
  }
}
