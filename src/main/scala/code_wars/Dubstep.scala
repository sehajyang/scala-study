package code_wars

import org.scalatest.{FlatSpec, Matchers}

/**
  * @author seha
  * @date 2019-07-23
  * source : https://www.codewars.com/kata/dubstep/train/scala
  * description : WUB 없애기, WUB가 아무리 많아도 공백1로 취급
  */
object Dubstep extends App {
  def solution1(song: String): String = {
    song.replaceAll("WUB", " ").split(" ").toList.filter(i => i != "" && i + 1 != "").mkString(" ")
  }

  val str = "AWUBWUBWUBBWUBWUBWUBC"
  val solution2 = str.replaceAll("(WUB)+", " ").trim
  val solution3 = str.split("WUB").filter(!_.isEmpty).mkString(" ")

  println(solution1(str))
  println(solution2)
  println(solution3)


  class WubTest extends FlatSpec with Matchers {

    val tests = List(
      ("AWUBBWUBC", "A B C", "WUB should be replaced by 1 space"),
      ("AWUBWUBWUBBWUBWUBWUBC", "A B C", "multiples WUB should be replaced by only 1 space"),
      ("WUBAWUBBWUBCWUB", "A B C", "heading or trailing spaces should be removed")
    )

    tests.foreach {
      case (input, expected, message) =>
        s"songDecoder($input)" should s"return $expected" in {
          withClue(message) {
            Dubstep.solution1(input) should be(expected)
          }
        }
    }
  }
}


