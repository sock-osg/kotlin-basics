fun main(args: Array<String>) {
  // Immutable array
  val arrayA = intArrayOf(1, 2, 3, 4)
  // Immutable list
  val listA = arrayListOf("A", "B", "C")

  // This can be used as an array
  //val num = arrayA.get(0)
  val num = arrayA[0]

  // This can be changed with index
  //arrayA.set(2, 500)
  arrayA[2] = 500

  val mutableList = mutableListOf(2, 3, 4, 5, 6, 7, 8)
  mutableList.add(9)
  mutableList.add(2, 300)
  //
  //mutableList.set(0, 100)
  mutableList[0] = 100

  val mutableMap = mutableMapOf(Pair("A", 30))
  mutableMap.put("B", 50)
}
