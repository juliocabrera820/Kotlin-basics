package HighOrderFunctions

fun main() {
    val may = mayuscula()
    may("ejemplo")

    var num = cuadrado()
    println(num(4))
    println(num(7))
    println(num(11))

    contar("Rails", {x -> x.length})

}

fun mayuscula():(String)->Unit{
    return {x -> println(x.toUpperCase())}
}

fun cuadrado(): (Int) -> Double {
    return {x -> Math.pow(x.toDouble(), 2.0)}
}

fun contar(palabra:String,expresion:(String)->Int):Unit{
    println("$palabra tiene ${expresion(palabra)} letras")
}