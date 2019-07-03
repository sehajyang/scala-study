/**
  * @author seha
  * @date 2019-07-03
  */
object Timer {
  def oncePerSecond(callback: () => Unit): Unit ={
    while (true) {callback(); Thread sleep 1000}
  }

  def timeFlies(): Unit = {
    println("time files like an arrow")
  }

  def main(args: Array[String]): Unit = {
    oncePerSecond(timeFlies)
  }

}
