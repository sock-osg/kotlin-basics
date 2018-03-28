// Unit is similar to void in Java
fun hello(): Unit {
  println("Webos a todos")
}

fun suma(a: Int, b: Int) {
  println("La suma de $a y $b es igual a ${a + b}")
}

//fun max(a: Int , b: Int): Int {
//  if (a > b)
//    return a
//  else
//    return b
//}
// Simplifying the function above
fun max(a: Int , b: Int) = if (a > b) a else b

fun main(args: Array<String>) {
  println(max(4, 1))
}
