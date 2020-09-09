import scala.util.matching.Regex

object Main {
  def main(args: Array[String]): Unit = {
    val numberPattern: Regex = "[0-9]+".r()

    var patternMatch: Option[Regex.Match] = numberPattern.findFirstMatchIn("awesome!")

    def foundMatch(patternMatch: Option[Regex.Match]): Unit = {
      patternMatch match {
        case Some(patternMatch) => {
          println("match found!")
          println(patternMatch.asInstanceOf[Regex.Match].group(0))
        }
        case None => println("no match found!")
      }
    }

    foundMatch(patternMatch)
    patternMatch = numberPattern.findFirstMatchIn("my number is 123")
    foundMatch(patternMatch)
  }
}
