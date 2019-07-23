package code_wars
import org.scalatest.FunSuite

/**
  * @author seha
  * @date 2019-07-23
  * source : https://www.codewars.com/kata/build-a-pile-of-cubes/train/scala
  */
object BuildAPileOfCubes extends App {

  def solution(m: Long): BigInt = {
    val n=((math.sqrt(1+8* math.sqrt(m))-1)/2).toInt
    if (math.pow(n * (n + 1) / 2, 2) != m) return -1
    n.toInt
  }

  print(solution(24723578342962L))

  class CubeTest extends FunSuite {

    test("Samples") {
      assert(BuildAPileOfCubes.solution(4183059834009L)   === 2022)
      assert(BuildAPileOfCubes.solution(24723578342962L)  === -1)
      assert(BuildAPileOfCubes.solution(135440716410000L) === 4824)
      assert(BuildAPileOfCubes.solution(40539911473216L)  === 3568)
      assert(BuildAPileOfCubes.solution(26825883955641L)  === 3218)
    }
  }
}
