import scala.annotation.tailrec

/**
  * @author seha
  * @date 2019-07-11
  *
  */
object ListExam {
  def countVar(all: Seq[String]): Int = {
    var temp = 0
    for (one <- all) {
      if (one.length == 5)
        temp = temp + 1
    }
    temp
  }

  def countVal(list: Seq[String]): Int = {
    @tailrec
    def countVal(value: Int, remain: Seq[String]): Int = {
      remain match {
        case head :: tail if head.length == 5 => countVal(value + 1, tail)
        case head :: tail => countVal(value, tail)
        case Nil => value
      }
    }

    countVal(0, list)
  }

  def main(args: Array[String]): Unit = {
    val a = Seq("apple", "banana", "kiwi", "mango" )
    println(countVar(a))
    println(countVal(a))
  }

}
