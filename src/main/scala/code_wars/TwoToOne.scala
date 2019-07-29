package code_wars
import org.scalatest._

/**
  * @author seha
  * @date 2019-07-29
  * source : https://www.codewars.com/kata/two-to-one/train/scala
  * description : 문자열 두개 합치기 > 중복제거 > 알파벳 오름차순 정렬
  */
object TwoToOne{

  def longest(s1: String, s2: String): String = {
    (s1 + s2).toSeq.distinct.sorted.unwrap
  }

  def main(args: Array[String]): Unit = {
    print(longest("loopingisfunbutdangerous", "lessdangerousthancoding"))
  }

  class KataTest extends FlatSpec with Matchers {

    val tests = List(
      (("aretheyhere", "yestheyarehere"), "aehrsty"),
      (("loopingisfunbutdangerous", "lessdangerousthancoding"), "abcdefghilnoprstu"),
      (("inmanylanguages", "theresapairoffunctions"), "acefghilmnoprstuy")
    )

    tests.foreach {
      case ((s1, s2), expected) =>
        s"longest($s1, $s2)" should s"return $expected" in {
          TwoToOne.longest(s1, s2) should be (expected)
        }
    }
  }
}
