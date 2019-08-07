package code_wars

/**
  * @author seha
  * @date 2019-08-01
  * source : https://www.codewars.com/kata/removing-elements/train/scala
  * description : 가장 짧은 단어 길이 리턴
  */
object ShortestWord{
  def solution1(str: String): Unit = println(str.split(' ').toList.sortWith(_.length < _.length)(0).length)

  def solution2(str:String): Unit = println(str.split(' ').minBy(_.length).length)

  def solution3(str:String): Unit = println(str.split(' ').map(_.length).min)

  def main(args: Array[String]): Unit = {
    val str = "bitcoin take over the world maybe who knows perhaps"
    solution1(str)
    solution2(str)
    solution3(str)
  }
}
