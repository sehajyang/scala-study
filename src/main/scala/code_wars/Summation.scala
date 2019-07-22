package code_wars

/**
  * @author seha
  * @date 2019-07-22
  * problem : https://www.codewars.com/kata/grasshopper-summation/train/scala
  */
object Summation extends App {

  def summation(n: Int):Int ={
    if(n == 1) n else n+summation(n-1)
  }

  def summation2(n: Int): Int = {
    n match {
      case 1 => 1
      case num => num + summation(num - 1)
    }
  }

  print((1 to 2).sum)

}
