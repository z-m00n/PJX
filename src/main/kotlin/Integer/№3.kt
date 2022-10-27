import java.util.Scanner
fun main(){
    val input = Scanner(System.`in`)
    val a= input.nextInt()
   print("Сумма :${(a/10)+(a%10)}\nПроизведение :${(a/10)*(a%10)}")
}