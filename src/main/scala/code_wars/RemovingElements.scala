package code_wars

import org.scalatest.{FlatSpec, Matchers}


/**
  * @author seha
  * @date 2019-07-23
  * source : https://www.codewars.com/kata/removing-elements/train/scala
  * description : 짝수번째 아이템 삭제
  */
object RemovingElements extends FlatSpec with Matchers {

  def solution1[T](list: List[T]): List[T] = {
    list.zipWithIndex.collect {
      case (x, i) if i % 2 == 0 => x
    }
  }

  //다른 풀이
  def solution2[T](list: List[T]): List[T] = {
    list.indices.collect { case i if i % 2 == 0 => list(i) }.toList
  }

  def solution3[T](list: List[T]): List[T] = {
    list match {
      case Nil => Nil
      case x :: Nil => x :: Nil
      case x :: y :: tail => x :: solution3(tail)
    }
  }

  def solution4[T](list: List[T]): List[T] = {
    list.zipWithIndex.filter({ case (_, index) => index % 2 == 0 })
      .map({ case (element, _) => element })
  }

  def solution5[T](list: List[T]): List[T] = {
    list.zipWithIndex.filter({ case (_, index) => index % 2 == 0 }).unzip._1
  }

  def solution6[T](list: List[T]): List[T] = {
    for (i <- (0 until list.size-1 by 2).toList) yield list(i)
  }

  def main(args: Array[String]): Unit = {

    //Test
    val tests = List(
      (List("Hello", "Goodbye", "Hello Again"), List("Hello", "Hello Again")),
      (List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), List(1, 3, 5, 7, 9)),
      (List(List(1, 2)), List(List(1, 2))),
      (List(List("Goodbye"), Map("Great" -> "Job")), List(List("Goodbye")))
    )

    tests.foreach {
      case (input, expected) =>
        s"removeEveryOther($input)" should s"return $expected" in {
          solution1(input) should be(expected)
        }
    }
    val a = List.range(1,10)
    println(solution6(a))
  }
}
