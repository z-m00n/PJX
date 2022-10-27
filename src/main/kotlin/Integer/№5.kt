import java.util.Scanner
fun main(){
    val input = Scanner(System.`in`)
    val  a = input.nextInt()
    val b = (a/100)
    val c = (( a - b*100)/10)
    val d = (a%10)
   val ass = ((c*100) + (d*10)+b)
    print(ass)
}