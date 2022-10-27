fun main() {
    print("введите значение: ")
    val x = readLine()!!.toInt()
    val y = 3 * (x * x * x * x * x * x ) - 6 * (x * x) - 7
    println(y)
}