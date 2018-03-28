fun main(args: Array<String>) {
  var a: String = "abc"

  var b: String? = "abc" // This is used(?) to say compiler that the value can be null
  b = null

  val l1 = a.length
  val lbNull = b?.length
  println(lbNull)
  val lbNotNull = b?.length ?: 0 // Elvis operator, if it's null return 0
  println(lbNotNull)

  // Another way to make nullsafe code is using the 'let' operator
  // This is when b is not null
  b?.let {
    // Do something
  }

  // This is the case when 'b' is null and i want to initialize
  b.let {
    // Do something
  }
}