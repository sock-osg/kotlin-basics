// This is a singleton, it's ony necessary the reserved word 'object'
object Validciones {

  fun passwordValida(psw: String) = psw.isNotEmpty() && psw.length > 10

  fun esNumero(dato: Any) = dato is Int
}

fun main(args: Array<String>) {
  print("Ingresa tu contraseña: ")
  val password: String = readLine()!! // This means that i want to execute this it doesn't matter value would be null
  println(Validciones.passwordValida(password))

  print("Ingresa un numero: ")
  val numero: Int = readLine()?.toInt() ?: 0
  println(numero)
}
