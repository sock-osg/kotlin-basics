class Ejemplo {

  fun hello(): Unit {
    println("Webos a todos")
  }
}

// Complicated constructor
//class Persona constructor(val nombre:String) {

// Defining a main constructor
class Persona(val nombre:String) {

  // This is executed when object is created
  init {
    println("Nombre: $nombre")
  }

  constructor(name: String, edad: Int): this(name) {
    println("Nombre $nombre, edad: $edad")
  }
}

// 'open' allows get hierarchy
open class Base(val inicial: Int) {

  open fun imprimeAlgo() {
    println("Algo $inicial")
  }
}

class General(val d: Int) : Base(d) {

  override fun imprimeAlgo() {
    super.imprimeAlgo()
    val suma = 4 + d
    println("Suma $suma")
  }
}

fun main(args: Array<String>) {
  val persona = Persona("Rogelio", 50)
  println(persona)

  val general = General(500)
  general.imprimeAlgo()
}
