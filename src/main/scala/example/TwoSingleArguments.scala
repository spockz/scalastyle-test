package example

/**
 * Created by alessandrovermeulen on 17/05/2017.
 */
class TwoSingleArguments {
  def foo(): Unit = {
    val x = new Object
    Await.result(x)

    // This should be an error as well
    Await.result(x)
  }
}
