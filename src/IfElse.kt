fun main(args: Array<String>) {
  defineTipo("Hello World")
  defineTipoUsingWhen(500)
}

// If blocks always returns something
fun esMayor(data: Int): String =
  if (data > 0) {
    "true"
  } else {
    "false"
  }

fun defineTipo(data: Any) {
  if (data is String) {
    println(data.length) // Automatic cas to string!! OMFG
  } else if (data is Int) {
    println("${data + 1}")
  }
}

fun defineTipoUsingWhen(data: Any) {
  when (data) {
    is String -> println(data.length)
    is Int -> println("${data + 1}")
    else -> println("No se que tipo es")
  }
}