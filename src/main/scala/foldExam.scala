
/**
  * @author seha
  * @date 2019-07-22
  * source : https://qowns8.github.io/scala/2018/06/14/iteratorTypePedigree.html
  */
object foldExam extends App {

  case class score(examType: String, point: Int)

  val exam = List(
    score("A", 300), score("B", 700), score("C", 200), score("A", 800)
  )

  val rst =  exam.foldLeft(score("A", 0)) {(now, next) =>
    next match {
      case score("A", _) => score("A", next.point + now.point)
      case _ => now
    }
  }
  println(rst)

  println(List("a", "b", "c").zipWithIndex) //idx를 붙여줌

  case class Fruit(name: String, price: Int)

  val fruits = List(
    Fruit("apple", 1000),
    Fruit("banana", 300),
    Fruit("orange", 500)
  )

  println(fruits.filter(_.price < 1000))
  println(fruits.filterNot(_.price < 1000))
}
