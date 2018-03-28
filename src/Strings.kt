fun main(args: Array<String>) {
  val str = "Una cadena Sting normal"
  val nombre = "Mabel"
  val edad = 25

  val sentencia = "Ella es $nombre y tiene $edad años"

  println(sentencia)

  val cump = "$nombre cumple ${edad + 1} años"

  println(cump)

  // By default | is used to trim, this can be changed in the method trimMargin
  val longText = """
    >Este es un string que quiero imprimir
    |que es demaciado largo como le gusta a $nombre
    |y tiene varios renglones
  """.trimMargin(">")

  println(longText)
}
