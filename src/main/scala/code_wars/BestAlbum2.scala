package code_wars

/**
  * @author seha
  * @date 2019-08-08
  * source : https://programmers.co.kr/learn/courses/30/lessons/42579?language=scala
  */

object BestAlbum2 {

//  require scala version 2.13.0 +
//  def solution(genres: List[String], plays: List[Int]): List[Int] = {
//    val indexGrouping = genres.zip(plays.zipWithIndex).groupMap(_._1)(_._2)
//    val newmap = indexGrouping.map { case (k, v) => k -> v.sortBy(-_._1) }
//    newmap.toList.flatMap(x => x._2).map(e => e._2).take(4)
//  }

  //another solution from programmers
  def solution2(genres: Vector[String], plays: Vector[Int]): Vector[Int] = {
    genres.zip(plays.zipWithIndex.map(x=> (x._1, List(x._2))))
      .groupBy(x=>x._1)
      .map(x=> x._2.sortBy(v=> -v._2._1)
      .reduce((a,b) => (a._1, (a._2._1+b._2._1, if(a._2._2.size<2) List(a._2._2.head, b._2._2.head) else a._2._2 )))).toList
      .sortBy(x=> -x._2._1)
      .flatMap(x=> x._2._2.map(y=> y)).toVector
  }

  def main(args: Array[String]): Unit = {
    assert(solution2(Vector("classic", "pop", "classic", "classic", "pop"), Vector(500, 600, 150, 800, 2500)) == Vector(4,1,3,0))
  }
}
