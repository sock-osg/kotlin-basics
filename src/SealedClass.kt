// TODO: research more about this topic
sealed class Intent {

  class Refresh: Intent()
  class RefreshMore: Intent()
}

fun main(args: Array<String>) {
  var intent: Intent = Intent.Refresh()

  val output = when(intent) {
    is Intent.Refresh -> "refresh"
    is Intent.RefreshMore -> "refresh more"
  }

  println(output)
}
