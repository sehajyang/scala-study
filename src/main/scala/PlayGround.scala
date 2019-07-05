/**
  * @author seha
  * @date 2019-07-05
  */
object PlayGround {

  def main(args: Array[String]): Unit = {
    println(max(1,2))
    val adds = add(1,3)
    println(mul(adds, 4))
    println(mulOfAdd(2,4))
  }

  def max(x: Int, y: Int): Int = {
    if (x > y) x
    else y
  }

  def add(x: Int, y: Int):Int = {
    x + y
  }

  def mul(i: Int, j: Int): Int = {
    i * j
  }

  def mulOfAdd(x: Int, y: Int): Int = mul(add(x,x),add(y,y))


}
