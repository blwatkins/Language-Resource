sealed abstract class Message {
  val from: String
}

case class Email(from: String, subject: String, body: String) extends Message

case class Text(from: String, body: String) extends Message

case class Voicemail(from: String, body: String) extends Message
