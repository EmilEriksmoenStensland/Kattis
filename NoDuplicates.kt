fun main() {
  val m = readLine()!!.split(" ")
  val n = m.distinct()
  if (n.size == m.size) println("yes") else println("no")
}
