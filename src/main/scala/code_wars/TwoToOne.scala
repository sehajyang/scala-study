package code_wars

/**
  * @author seha
  * @date 2019-07-29
  * source : https://www.codewars.com/kata/two-to-one/train/scala
  * description : 문자열 두개 합치기 > 중복제거 > 알파벳 오름차순 정렬
  */
object TwoToOne{

  def longest(s1: String, s2: String): Unit= {
    (s1 + s2).toSeq.distinct.sorted
  }

  def main(args: Array[String]): Unit = {
    print(longest("loopingisfunbutdangerous", "lessdangerousthancoding"))
  }


}
