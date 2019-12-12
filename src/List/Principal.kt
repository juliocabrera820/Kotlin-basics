package List

fun main() {
    var numeros = mutableListOf<Int>()
    numeros.add(10)
    numeros.add(11)
    numeros.add(20)
    numeros.add(30)
    numeros.add(11)
    numeros.add(7)
    numeros.add(2)
    numeros.add(9)
    numeros.add(10)

    numeros.forEach { println(it) }
    println("No repetir numeros")
    numeros.distinct().forEach { println(it) }
    println("Solo numeros pares")
    numeros.filter { it % 2 == 0 }.forEach{ println(it)}
    println("Ordenados")
    numeros.sorted().distinct().forEach { println(it) }

}