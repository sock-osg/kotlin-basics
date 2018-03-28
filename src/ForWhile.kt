fun main(args: Array<String>) {
  val listaNumeros = intArrayOf(10, 20, 30, 40, 50, 60)

  for (index in listaNumeros.indices) {
    println(listaNumeros[index])
  }

  val frutas = listOf("apple", "pineapple", "strawberry", "banana")

  for (fruta in frutas) {
    println(fruta)
  }

  var x = 3
  while (x > 0) {
    x--
    println(x)
  }

  var sum: Int = 0
  var input: String? = ""

  do {
    print("Ingresa un numero: ")
    input = readLine()
    sum += input!!.toInt()
  } while (input != "0")

  println("La suma es $sum")
}
