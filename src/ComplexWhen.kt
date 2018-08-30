data class VideoPlayer(val playPercentage: Int)

fun logVideoQuatile(player: VideoPlayer?) {
  // apply works if and only if is different of null
  player?.apply {
    val (quartile, percentQuatile) =
        when (playPercentage) {
          in 0..24 -> Pair(0, 0f)
          in 25..49 -> Pair(1, .25f)
          in 50..74 -> Pair(2, .50f)
          in 75..94 -> Pair(3, .75f)
          in 95..96 -> Pair(3, .95f)
          in 97..99 -> Pair(3, .97f)
          100 -> Pair(4, 1f)
          else -> Pair(-1, -1f)
        } 
    println("Quartile is $quartile an percent is $percentQuatile")
  }
}
