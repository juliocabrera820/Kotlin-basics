package OnLineFunction

fun main() {
    println(verificar(11))
    println(verificar(1))
    println(verificar(2))
}

fun verificar(num: Int):String = if (num%2 ==0) " $num es par" else "$num es impar"