package code_wars
import org.scalatest._
import org.scalatest.Assertions._

import code_wars.Rotations.RotationsTest._
/**
  * @author seha
  * @date 2019-07-29
  * source : https://www.codewars.com/kata/all-inclusive/scala
  * description :
  */
object Rotations {

  def containAllRots(strng: String, arr: List[String]): java.lang.Boolean = {
    true
  }

  class RotationsTest extends FlatSpec {
    it should "pass basic tests" in {
      var a = List("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs")
      testing(Rotations.containAllRots("bsjq", a), exp = true)
      a = List("TzYxlgfnhf", "yqVAuoLjMLy", "BhRXjYA", "YABhRXj", "hRXjYAB", "jYABhRX", "XjYABhR", "ABhRXjY")
      testing(Rotations.containAllRots("XjYABhR", a), exp = false)
      a = List("hQmSQJA", "QJAhQmS", "QmSQJAh", "yUgUXoQE", "AhQmSQJ", "mSQJAhQ", "SQJAhQm", "JAhQmSQ")
      testing(Rotations.containAllRots("QJAhQmS", a), exp = true)
      a = List("nVOETcaxdvuk", "shpEts", "hpEtss", "Etsshp", "OuIiQ", "sXrDdPXIaW", "tsshpE", "pEtssh")
      testing(Rotations.containAllRots("Etsshp", a), exp = false)

    }
  }

  object RotationsTest {
    def testing(act: Boolean, exp: Boolean): Unit = {
      assertResult(exp){act}
    }
  }

}
