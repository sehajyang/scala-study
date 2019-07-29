package code_wars

/**
  * @author seha
  * @date 2019-07-22
  * description : 세기 구하기
  */
object CenturyFromYear extends App{
  def centuryFromYear(year: Double): Double = (year * 0.01).ceil
}
