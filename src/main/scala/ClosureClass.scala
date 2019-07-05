/**
  * @author seha
  * @date 2019-07-05
  */
class ClosureClass {
  def printResult[T](f: => T) ={
    println(f)
  }

  def printResult[T](f: String => T) = {
    println(f("HI THERE"))
  }
}
object ClosureClassMain {
  def main(args: Array[String]): Unit = {
    val cc = new ClosureClass
    cc.printResult { "a" }
  }
}
