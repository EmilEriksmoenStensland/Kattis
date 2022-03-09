fun main() {
  repeat (readLine()!!.toInt()) {
    val mid = readLine()!!.split(" ").map { it.toInt() }
    var sum = 0
    for (i in 1 until mid.size -1) {
      if (mid[i-1]*2 < mid[i]) sum += mid[i] - mid[i-1]*2
    }
    println(sum)
  }
}
