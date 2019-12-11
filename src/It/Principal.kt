package It

import kotlin.math.pow

fun main() {
    //{it.toUpperCase()} == {x -> x.toUpperCase}
    mayuscula("ParaDigma",{it.toUpperCase()})
    cuadrado(15,{ it.toDouble().pow(2.0) })
    mayuscula("expresion",{it.reversed()})
}

fun mayuscula(palabra:String,lamb:(String)->String){
    println(lamb(palabra))
}

fun cuadrado(num:Int,lamb:(Int)->Double):Unit{
    println(lamb(num))
}