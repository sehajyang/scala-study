package scala_tutorial.tail_recursion

import org.scalatest.Matchers._
import scala.annotation.tailrec

/**
  * @author seha
  * @date 2019-07-09
  * 꼬리재귀
  */

object TailRecursion {

  def factorial(n: Int): Int = {
    @tailrec
    def fac(x: Int, acc: Int): Int =
      if (x == 2) acc
      else fac(x - 1, x * acc)

    fac(n, 2)
  }

  def fibonacci(idx: Int): Int = {
    if (idx <= 0) 0
    else if (idx <= 1) 1
    else fibonacci(idx - 1) + fibonacci(idx - 2)

  }

  // Int는 범위초과 남
  def tailRecFibo(idx: BigInt): BigInt = {
    @tailrec
    def tailFibo(idx: BigInt, prev: BigInt, cur: BigInt): BigInt = {
      if (idx <= 0) cur
      else tailFibo(idx - 1, prev = prev + cur, cur = prev)
    }
    tailFibo(idx, prev = 1, cur = 0)
  }


  def main(args: Array[String]): Unit = {
    factorial(3) shouldBe 6
    fibonacci(6) shouldBe 8
    tailRecFibo(6) shouldBe 8

    println(tailRecFibo(4000000))

  }
}

