// in 'if' or 'when' always return the last sentence
fun whoIs(person: String) =
  when (person) {
    "Mabel" -> {
      val text = "Text"
      "Puedes abrir la puerta"
      text
    }
    "Darla" -> "Puedes abrir la puerta"
    else -> "Corre de la casa!"
  }

// Short version
fun whoIsShort(person: String) =
    when (person) {
      "Mabel", "Darla", "Pablo" -> "Puedes abrir la puerta"
      else -> "Corre de la casa!"
    }

fun rango(numero: Int) {
  when (numero) {
    in 1..10 -> println("Numero positivo menor o igual a 10")
    in 11..100 -> println("Numero positivo mayor a 10 y menor que 100")
    else -> println("Este es un numero fuera del rango")
  }
}

fun main(args: Array<String>) {
  println(whoIs("Mabel"))
  rango(80)
}
