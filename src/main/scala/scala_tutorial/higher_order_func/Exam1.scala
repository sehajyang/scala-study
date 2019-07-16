package scala_tutorial.higher_order_func

import org.scalatest.Matchers._
/**
  * @author seha
  * @date 2019-07-16
  * @source : https://docs.scala-lang.org/ko/tour/higher-order-functions.html
  */
object Exam1 extends App{

  class Decorator(left: String, right: String) {
    def layout[A](x:A) = left +x.toString + right
  }

  class Demage(left: Int, right: Int) {
    def threeMinus[A](x: A) = (left - 3) + "," + x.toString + "," + (right - 3)
    def onePlus[A](x: String):Int = left.+(right).+(x.toInt)
  }

  def apply(f:Int => String, v:Int) = f(v)
  def toInt(f:String => Int, v:String) = f(v)

  val decorator = new Decorator("[", "]")
  val demage = new Demage(5, 7)


  apply(decorator.layout, 7) shouldBe "[7]"
  apply(demage.threeMinus, 3) shouldBe "2,3,4"
  toInt(demage.onePlus, "2") shouldBe 14

}
