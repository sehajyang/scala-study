package scala_tutorial.lexical_scope

/**
  * @author seha
  * @date 2019-07-05
  * @source : https://www.scala-exercises.org/scala_tutorial/lexical_scopes
  */
object NastedFunc {
  def square(x: Double): Double = x * x
  def abs(x: Double): Double = if (x >= 0) x else -x


  def sqrt(x: Double): Double = {
    def sqrtlter(guess: Double, x: Double): Double =
      if (isGoodEnough(guess, x)) guess
      else sqrtlter(improve(guess, x), x)

    def improve(guess: Double, x: Double) =
      (guess + x / guess) / 2

    def isGoodEnough(guess: Double, x: Double) =
      abs(guess * guess - x) < 0.001


    sqrtlter(1.0, x)
  }

  def sqrt2(x: Double): Double ={
    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def improve(guess: Double) =
      (guess + x / guess) / 2

    def isGoodEnough(guess: Double) =
      abs(square(guess) - x) < 0.001

    sqrtIter(1.0)
  }

  def main(args: Array[String]): Unit = {
    print(sqrt(2.0))
  }
}
