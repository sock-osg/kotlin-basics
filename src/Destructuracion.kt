data class Familiar(val name: String = "Rodrigo", val age: Int = 23, val hairColor: String = "black")

data class Result(val result: Int, val status: Boolean)

fun calcular(a: Int, b: Int): Result =
  if (a * 2 > b) {
    Result(a * 2, true)
  } else {
    Result(a, false)
  }

fun main(args: Array<String>) {
  val rodrigo = Familiar()

  /*
  val name = rodrigo.name
  val age = rodrigo.age
  val hairColor = rodrigo.hairColor
  */
  // A better way to do the same is using destructuring
  val (name, _, color) = Familiar() // Using variables with different name
  //val (name, age, hairColor) = Familiar()

  //println("Nombre: $name, HairColor: $hairColor")
  println("Nombre: $name, HairColor: $color")
  //println("Nombre: $name, Age: $age, HairColor: $hairColor")

  // It's not possible skip attributes, we must use '_' for the unused parameters

  val (resultado, estatus) = calcular(4, 3)
  println("Resultado: $resultado, Estatus: $estatus")
}
