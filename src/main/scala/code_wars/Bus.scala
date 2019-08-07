package code_wars

/**
  * @author seha
  * @date 2019-08-07
  * source : https://www.codewars.com/kata/5648b12ce68d9daa6b000099/train/scala
  */
object Bus {
  def number(busStops: List[(Int, Int)]): Int = busStops.map(e => e._1 - e._2).sum

  def number2(busStops: List[(Int, Int)]): Int = (for ((e1, e2) <- busStops) yield e1 - e2).sum

  def number3(busStops: List[(Int, Int)]): Int = busStops.map { case (e1, e2) => e1 - e2 }.sum

  def main(args: Array[String]): Unit = {
    assert(number(List((10, 0), (3, 5), (5, 8))) == 5)
    assert(number(List((3, 0), (9, 1), (4, 10), (12, 2), (6, 1), (7, 10))) == 17)
    assert(number(List((3, 0), (9, 1), (4, 8), (12, 2), (6, 1), (7, 8))) == 21)
  }
}
