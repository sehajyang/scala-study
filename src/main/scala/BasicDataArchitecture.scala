/**
  * @author seha
  * @date 2019-07-04
  */
object BasicDataArchitecture {
  def list(): Unit = {
    val numbers = List(1, 2, 3, 4)
    println(numbers)
  }

  def tuple(): Unit = {
    val hostPort = ("localhost", 80)
    println(hostPort)
  }

  def set(): Unit = {
    println(Set(1, 1, 2))
  }

  def map(): Unit = {
    println(Map(1 -> 2)) //Map(1,2)
  }

  def main(args: Array[String]): Unit = {
    list()
    tuple()
    set()
    map()
  }
}
