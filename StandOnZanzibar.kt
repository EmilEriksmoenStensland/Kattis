fun main() {
  val n = readLine()!!.toInt()
  repeat (n) {
    val m = readLine()!!.split(" ")
    val mid = m.map {it.toInt()}
    var sum = 0
    var prev = mid[0]
    for (i in 1 until mid.size -1) {
      if (prev*2 < mid[i]) sum += mid[i] - prev*2
      prev = mid[i]
    }
    println(sum)
  }
}
