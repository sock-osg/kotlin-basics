fun main(args: Array<String>) {
  for (value in 1..10) {
    println(value)
  }

  for (value in 1 until 10) { // 10 is not considered
    println(value)
  }

  for (value in 10 downTo 1) {
    println(value)
  }

  for (value in 10 downTo 1 step 5) {
    println(value)
  }

  val esOnce = (1..12 step 2).last == 11
  println(esOnce)
}