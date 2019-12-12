package WithApply

fun main() {
    var per = Persona("Miguel",26)
    println(per)

    with(per){
        nombre = "Rodrigo"
        edad = 28
    }
    println(per)

    per.apply {
        nombre = "David"
        edad = 23
    }
    println(per)
}