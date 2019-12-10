package ExtensionFunctions

fun main() {
    var p = Persona("Sarah",25)
    var nombreCompleto = p.agregarApellido("Chamber")
    println(nombreCompleto)

    val lang:String = "Kotlin"
    println(lang.concat("Java","Dart"))

    val num = 10
    println(num.multiplicar(4,2))
}
fun Persona.agregarApellido(apellido:String):String{
    return "$nombre $apellido $edad"
}

fun String.concat (lan1:String,lan2:String):String{
    return "$this $lan1 $lan2"
}

fun Int.multiplicar(num:Int,num2:Int):Int{
    return this*num*num2
}