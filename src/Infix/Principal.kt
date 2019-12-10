package Infix

fun main() {
    val nombre = "Emily"
    println("$nombre tiene ${nombre.count()} letras")
    val nom = "Paulina"
    val res = nom mayor 22
    print(res)
}

fun String.count():Int{
    return this.length
}

//Usando infix
//solo se puede usar cuando la funcion recibe un solo parametro
infix fun String.mayor(edad:Int):String{
    return if(edad>=18) "$this es mayor de edad" else "$this es menor de edad"
}