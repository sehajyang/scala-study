package project_euler

/**
  * @author seha
  * @date 2019-07-16
  * @source https://projecteuler.net/problem=1
  */
object Problem002 {
  def rst1(x: Int, y: Int, until: BigInt): BigInt = {
    val sumXY = x + y
    if (y > until) 0
    else if (y % 2 == 0) y + rst1(y, sumXY, until)
    else rst1(y, sumXY, until)
  }

  def main(args: Array[String]): Unit = {
    print(rst1(1, 2, 4000000))
  }
}
