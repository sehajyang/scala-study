import java.text.DateFormat._
import java.util.{Date, Locale}
/**
  * @author seha
  * @date 2019-07-01
  */

object JapanDate {
  def main(args: Array[String]): Unit = {
    val now = new Date
    val df = getDateInstance(LONG, Locale.FRANCE)
    println(df format now)
  }
}
