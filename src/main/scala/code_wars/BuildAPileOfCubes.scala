package code_wars
import org.scalatest.FunSuite

/**
  * @author seha
  * @date 2019-07-23
  * source : https://www.codewars.com/kata/build-a-pile-of-cubes/train/scala
  */
object BuildAPileOfCubes extends App {

  def solution1(m: Long): BigInt = {
    val n=((math.sqrt(1+8* math.sqrt(m))-1)/2).toInt
    if (math.pow(n * (n + 1) / 2, 2) != m) return -1
    n.toInt
  }

  def solution2(m: Long, n: Long = 0, v: Long = 0): Long =
    if (v == m) n-1 else if (v < m) solution2(m, n+1, v+n*n*n) else -1

  def solution3(m: Long): Int = {
    var n = 1
    var p = m
    while(p>0){
      p = p - Math.pow(n,3).toLong
      n = n + 1
    }
    if(p == 0) n-1
    else -1
  }

  println(solution1(24723578342962L))
  println(solution2(24723578342962L))
  println(solution3(24723578342962L))

  class CubeTest extends FunSuite {

    test("Samples") {
      assert(BuildAPileOfCubes.solution1(4183059834009L)   === 2022)
      assert(BuildAPileOfCubes.solution1(24723578342962L)  === -1)
      assert(BuildAPileOfCubes.solution1(135440716410000L) === 4824)
      assert(BuildAPileOfCubes.solution1(40539911473216L)  === 3568)
      assert(BuildAPileOfCubes.solution1(26825883955641L)  === 3218)
    }
  }
}
