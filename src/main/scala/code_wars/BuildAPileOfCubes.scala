package code_wars
import org.scalatest.FunSuite

/**
  * @author seha
  * @date 2019-07-23
  * source : https://www.codewars.com/kata/build-a-pile-of-cubes/train/scala
  * description : (n+1)^3 + (n)^3 + (n-1)^3 + ... + (1)^3 = m(입력 값) 에서 n을 구하는 문제, 만약 존재하지 않을경우 -1 리턴
  */
object BuildAPileOfCubes extends App {

  def solution1(m: Long): BigInt = {
    val n=((math.sqrt(1+8* math.sqrt(m))-1)/2).toInt
    if (math.pow(n * (n + 1) / 2, 2) != m) return -1
    n.toInt
  }

  def solution2(m: Long, n: Long = 0, v: Long = 0): Long =
    if (v == m) n-1 else if (v < m) solution2(m, n+1, v+n*n*n) else -1

  println(solution1(24723578342962L))
  println(solution2(24723578342962L))

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
