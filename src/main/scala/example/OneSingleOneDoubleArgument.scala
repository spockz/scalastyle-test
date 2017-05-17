package example

/**
 * Created by alessandrovermeulen on 17/05/2017.
 */
class OneSingleOneDoubleArgument {
  def foo(): Unit = {
    val x = new Object

    // Only complain about this line, expected
    Await.result(x)

    Await.result(x, Duration.fromSeconds(1))
  }
}
