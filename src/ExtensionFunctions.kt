fun main(args: Array<String>) {
  "Hola mi nombre es Samuel".print()
  println(4.multiply(2))
  println(4 multiply 2) // using infix :D:D:D:D
  println("Hola mundo".toString())
}

// fun Int.multiply(numM: Int): Int {
// Same with superpowers 'infix'
infix fun Int.multiply(numM: Int): Int {
  return this * numM // 'this' corresponds to current Int
}

fun String.print() {
  println(this) // 'this' corresponds to current string
}

// If a class has a member function, and an extension function is defined which has the same receiver type,
// the same name and is applicable to given arguments, the member always wins
fun String.toString(): String {
  return "${this.toString()} -- Reescrito"
}
