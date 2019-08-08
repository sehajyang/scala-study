package code_wars

/**
  * @author seha
  * @date 2019-08-05
  * source : https://www.codewars.com/kata/fizz-buzz-cuckoo-clock/train/scala
  */
object FizzBuzzCuckooClock {
  def solution(time: String): String = {
    val hour = time.substring(0, 2).toInt
    val minutes = time.substring(3, 5).toInt
    val rhour = if (hour > 12) hour - 12 else hour

    def fizz(minutes:Int):String= {
      if (minutes % 15 == 0) "Fizz Buzz"
      else if (minutes % 3 == 0) "Fizz"
      else if (minutes % 5 == 0) "Buzz"
      else "tick"
    }

    def sharp(rhour:Int, minutes:Int):String ={
      if (minutes == 30) "Cuckoo"
      else if (minutes == 0 && rhour != 0) "Cuckoo "*rhour
      else if (minutes == 0 && rhour == 0) "Cuckoo "*12
      else fizz(minutes)
    }

    sharp(rhour, minutes).trim
  }

  //another solution
  def solution2(time: String): String = {
    time.split(":") match {
      case Array(hour, minute) =>
        val min = minute.toInt
        val h = hour.toInt
        if (min == 0 && h == 0) "Cuckoo ".*(12).dropRight(1)
        else if (min == 0) "Cuckoo ".*(if (h > 12) h-12 else h).dropRight(1)
        else if (min == 30) "Cuckoo"
        else if (min % 3 == 0 && min % 5 == 0) "Fizz Buzz"
        else if (min % 3 == 0) "Fizz"
        else if (min % 5 == 0) "Buzz"
        else "tick"
    }
  }


  def solution3(time: String): String =
    time.split(":").map(_.toInt) match {
      case Array(hour, 0)                      => Array.fill(if (hour % 12 == 0) 12 else hour % 12)("Cuckoo").mkString(" ")
      case Array(_, 30)                        => "Cuckoo"
      case Array(_, 15|45)                     => "Fizz Buzz"
      case Array(_, minute) if minute % 5 == 0 => "Buzz"
      case Array(_, minute) if minute % 3 == 0 => "Fizz"
      case _                                   => "tick"
    }


  def main(args: Array[String]): Unit = {
    assert(FizzBuzzCuckooClock.solution2("00:00") == "Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo")
    assert(FizzBuzzCuckooClock.solution("21:00") == "Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo")
    assert(FizzBuzzCuckooClock.solution("03:03") == "Fizz")
    assert(FizzBuzzCuckooClock.solution("08:55") == "Buzz")
    assert(FizzBuzzCuckooClock.solution("11:15") == "Fizz Buzz")
    assert(FizzBuzzCuckooClock.solution("12:00") == "Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo")
    assert(FizzBuzzCuckooClock.solution("12:15") == "Fizz Buzz")
    assert(FizzBuzzCuckooClock.solution("12:05") == "Buzz")
    assert(FizzBuzzCuckooClock.solution("13:34") == "tick")
    assert(FizzBuzzCuckooClock.solution("14:30") == "Cuckoo")

  }
}
