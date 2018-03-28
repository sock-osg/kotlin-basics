// 'data' is similar to @Data in Lombok library

// Immutable class (using 'val')
//data class Auto(val marca: String)
data class Auto(var marca: String, private var puertas: Int) { // Using 'var' generates the setters/getters
  var numPuertas = puertas

  get() {
    return if (field > 0) field else 1
  }
}

data class Persona2(var name: String, val age: Int, val colorOjos: String)

fun main(args: Array<String>) {
  val auto = Auto("Volkswagen", 0)

  auto.marca = "Chevrolet"
  auto.hashCode()

  println("hashCode: ${auto.hashCode()}")
  println("toString: ${auto.toString()}")
  //auto.numPuertas = 3
  println(auto.numPuertas)

  val mabel = Persona2("Mabel", 24, "Cafes")
  // Clone
  val marla = mabel.copy("Marla")

  println(mabel)
  println(marla)

  println("--------------------")

  val darla = mabel
  darla.name = "Darla"

  println(mabel)
  println(marla)
  println(darla)
}
