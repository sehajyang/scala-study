import scala.collection.immutable.Queue
import scala.collection.mutable

/**
  * @author seha
  * @date 2019-07-22
  * source : https://hamait.tistory.com/566?category=79134
  */
object StackAndQueue extends App {

  //Queue
  //mutable
  val queue =  new scala.collection.mutable.Queue[String]
  queue += "a"
  queue ++= List("b", "c")
  println(queue.dequeue())

  //immutable
  val queue1: Queue[String] = Queue("scala", "python", "java")
  val queue2: Queue[String] = queue1 :+ "ruby"

  val enqueue: Queue[String] = queue1.enqueue("haskell")

  val dequeue: (String, Queue[String]) = queue1.dequeue
  val queue3: Queue[String] = queue1 ++ Queue[String]("ruby", "haskell")
  val emptyQueue: Queue[String] = Queue.empty[String]

  //Stack
  //mutable
  val stack = new mutable.Stack[Int]
  stack.push(1)
  stack.push(2)
  println(stack.pop)

  //immutable
  println(stack.push(4))
  println(stack.pop())
  println(stack.top)
}
