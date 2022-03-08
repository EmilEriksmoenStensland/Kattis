fun main() {
    val firstLine = readLine()!!.split(" ").map {it.toInt()}
    var s = firstLine[0] // when he leaves
    val t = firstLine[1] // when school starts
    val n = firstLine[2] // Number of transfers
    val walkTimes = readLine()!!.split(" ").map {it.toInt()}
    val busTime= readLine()!!.split(" ").map {it.toInt()}
    val busInterval = readLine()!!.split(" ").map {it.toInt()}
    for (i in 0..n) {
        s += walkTimes[i]
        while (i < n && s % busInterval[i] != 0) {
            s++
        }
        if (i < n) s += busTime[i]
    }
    if (s<=t) println("yes") else println("no")
}