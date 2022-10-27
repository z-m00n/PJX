package Begin

fun main()
{
    print("введите значение: ")
    val a = readLine()!!.toInt()
    print("введите значение: ")
    val b = readLine()!!.toInt()
    val s = a * b
    val p = 2 * (a + b)
    println(s)
    println(p)
}
