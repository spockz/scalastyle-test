package example

/**
 * Created by alessandrovermeulen on 17/05/2017.
 */
class OneTwoTwo {
  def foo(): Unit = {
    val x = new Object
    Await.result(x)

    Await.result(x, Duration.fromSeconds(1))

    Await.result(x, Duration.fromSeconds(1))
  }

  val client: Any => Any = ???

  def bar(): Unit = {
    val x = new Object

    Await.result(x)

    Await.result(client(x), Duration.fromSeconds(1))

    Await.result(client(x), Duration.fromSeconds(1))
  }
}