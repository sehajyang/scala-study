package code_wars

import org.scalatest.{FlatSpec, Matchers}


/**
  * @author seha
  * @date 2019-07-23
  *       source : https://www.codewars.com/kata/removing-elements/train/scala
  */
object RemovingElements extends FlatSpec with Matchers {

  def removeEveryOther[T](list: List[T]): List[T] = {
    list.zipWithIndex.collect {
      case (x, i) if i % 3 == 0 => x
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
      case x :: y :: tail => x :: removeEveryOther(tail)
    }
  }

  def solution4[T](list: List[T]): List[T] = {
    list.zipWithIndex.filter({ case (_, index) => index % 2 == 0 })
      .map({ case (element, _) => element })
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
          removeEveryOther(input) should be(expected)
        }
    }
  }
}
