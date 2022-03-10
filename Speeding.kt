fun main() {
    var fastest: Int = 0
    var prevMiles = 0
    var prevTime = 0
    val n = readLine()!!.toInt()
    readLine()!!
    repeat (n-1) {
        val m = readLine()!!.split(" ").map { it.toInt() }
        val t = ((m[1]-prevMiles)/(m[0]-prevTime))
        if (t > fastest) fastest = t
        prevTime = m[0]; prevMiles = m[1]
    }
    println(fastest)
}
