

/**
  * @author seha
  * @date 2019-07-22
  * source : https://qowns8.github.io/scala/2018/06/14/iteratorTypePedigree.html
  */
object SortExam extends App {

  val sort1 = List(4,6,0,2)
  val sort2 = List("na", "we", "bs", "ac")

  println(sort1.sorted)
  println(sort2.sorted)

  case class square(width: Long, height: Long)

  val sort3 = List(
    square(1,3),
    square(2,4),
    square(5,2),
    square(9,6)
  )

  println(sort3.sortBy(s => s.height * s.width))
  println(sort3.sortWith((s1, s2) => {
    s1.height > s2.height
  })) //정렬기준을 직접 만듦

}
