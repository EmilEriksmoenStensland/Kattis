fun main() {
    var num = 0
    for (i in 0 until readLine()!!.toInt()) {
        val press = readLine()!!.toInt()
        if (i % 2 == 0) num -= press else num += press
    }
    if (num <= 0) println("still running") else println(num)
}
