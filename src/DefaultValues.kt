fun saluda(saludo: String = "Hola a todos") {
  println(saludo)
}

fun otraFuncion(edad: Int = 0, esAdulto: Boolean = false, tieneRopa: Boolean = true) {

}

// Using default values in constructors
data class Point(val x: Int = 0)

fun main(args: Array<String>) {
  saluda("Hola que paso")
  saluda()

  // Using default values allows set all or none parameters, it doesn't matter order
  otraFuncion(esAdulto = true, edad = 39, tieneRopa = true)
  otraFuncion(esAdulto = true, tieneRopa = true)
  otraFuncion(39)

  // This is used to
  val point = Point()
}
