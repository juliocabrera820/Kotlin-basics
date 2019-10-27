package IO

fun main() {
    var num:Int
    print("Ingresa un numero : ")
    num = readLine()?.toInt() as Int
    println("El numero es $num")
    val name:String
    print("Ingresar nombre: ")
    name = readLine() as String
    print("Nombre $name")
}
