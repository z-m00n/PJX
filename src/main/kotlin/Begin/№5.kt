package Begin
import java.util.Scanner
fun main() {
    val input = Scanner(System.`in`)
    var a = input.nextInt()
    var b = input.nextInt()
    b = a.also{a = b}
    println(a)
    println(b)

}