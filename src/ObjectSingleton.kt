// This is a singleton, it's ony necessary the reserved word 'object'
object Validations {

  fun validatePassword(psw: String) = psw.isNotEmpty() && psw.length > 10

  fun isNumber(data: Any) = data is Int
}

// This is the same as above, but using another syntax
class UniversalClass private constructor() {

  companion object {

    private val myInstance = UniversalClass()

    @Synchronized
    fun create() : UniversalClass = myInstance
  }
}

fun main(args: Array<String>) {
  print("Ingresa tu contraseña: ")
  val password: String = readLine()!! // This means that i want to execute this it doesn't matter value would be null
  println(Validations.validatePassword(password))

  print("Ingresa un numero: ")
  val number: Int = readLine()?.toInt() ?: 0
  println(number)
  println(Validations.isNumber(number))

  val universalClassAtMain = UniversalClass.create()
  println(universalClassAtMain)

  anotherFunction()
}

fun anotherFunction() {
  val universalClassAtAnotherFunction = UniversalClass.create()
  println(universalClassAtAnotherFunction)
}