package When

fun main() {
    print("Ingresar un numero")
    var num = readLine()?.toInt()
    when(num){
        1 -> println("Es uno")
        2 -> println("Es dos")
        3 -> println("Es 300")
        else -> println("El numero es mayor que 3")
    }

    when(num){
        1,2,4 -> println("1-2-4")
        3,5,6 -> println("3-5-6")
        else ->{
            if(num!! % 2 == 0) print("Es par") else print("No es par")
        }
    }
}