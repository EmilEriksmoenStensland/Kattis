fun main() {
  val chars = readLine()!!.split("")
  var ans = ""
  var prev = chars[0]
  ans += prev
  for (i in 1 until chars.size) {
    if (chars[i] != prev) ans += prev
    prev = chars[i]
  }
  println(ans)
}
