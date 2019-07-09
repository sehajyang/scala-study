package scala_tutorial.higher_order_func
import org.scalatest._
import Matchers._

/**
  * @author seha
  * @date 2019-07-09
  */
object LinearRecursion {
  def sum(f: Int => Int, a: Int, b: Int): Int = {
    def loop(x: Int, acc: Int): Int = {
      if (x > b) acc
      else loop(x + 1, acc + f(x))
    }
    loop(a,0)
  }

  def main(args: Array[String]): Unit = {
    sum(x => x, 1, 10) shouldBe 55
  }
}

