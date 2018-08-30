fun main(args: Array<String>) {
  println(sum(4, 7))
  println(lowerThanFour("Holaaaaa enfermeraaaa!!!!"))
}

val sum: (Int, Int) -> Int = { x, y -> x + y }

val lowerThanFour: (String) -> Boolean = { it.length > 4 }
