package project_euler

/**
  * @author seha
  * @date 2019-07-16
  * @source https://projecteuler.net/problem=1
  */
object Problem001 extends App {
  def rst1(i: Int): Int = {
    if (i == 1) return 0

    val result = if (i % 3 == 0 || i % 5 == 0) i else 0
    rst1(i - 1) + result
  }

  val rst2 = (1 until 1000).view.filter(i => i % 3 ==0 || i % 5 == 0).sum

  assert(rst1(1000) == 234168)
  assert(rst2 == 233168)
}
