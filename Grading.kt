fun main() {
  val m = mapOf(0 to "A", 1 to "B", 2 to "C", 3 to "D", 4 to "E")
  val lim = readLine()!!.split(" ").map { it.toInt() }
  val g = readLine()!!.toInt()
  repeat (lim.size) {
    if (g >= lim[it]) {
      println(m.get(it))
      return
      }
  }
  println("F")
}
