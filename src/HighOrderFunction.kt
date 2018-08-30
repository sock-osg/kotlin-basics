fun sum(num: Int, num2: Int, func: () -> Unit) {
  println("Suma de $num y $num2 = ${num + num2}")
  func()
}

//fun String.function(func: (String) -> Unit) { // Receives a string, i can use 'it'
fun String.function(func: String.() -> Unit) { // Receives a function from String
  // despedazar el string
  this.func()
  println(this.length)
}

fun main(args: Array<String>) {
  "Hello".function {
    println(length)
  }

  with("helo") {
    println(length)
  }

  sum(3, 5) {
    println("External Function")
  }
}
