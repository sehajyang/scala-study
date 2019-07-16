/**
  * @author seha
  * @date 2019-07-12
  *       source : https://hamait.tistory.com/693?category=79134
  */
object CurryTest extends App {

  def filter(xs: List[Int], p: Int => Boolean): List[Int] =
    if (xs.isEmpty) xs
    else if (p(xs.head)) xs.head :: filter(xs.tail, p)
    else filter(xs.tail, p)

  def modN(n: Int)(x: Int) = (x % n) == 0

  val nums = List.range(1, 8)

  println(filter(nums, modN(2)))
  println(filter(nums, modN(3)))

}
