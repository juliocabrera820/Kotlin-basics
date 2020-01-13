package NullSafeOperators

fun main() {

    //Safe call
    var lang: String? = null
    println("El tamaño de lang es ${lang?.length}")

    //let: Si la variable no es null se ejecuta
    lang?.let {
        println("Lenguaje ${lang}")
    }
    lang = "Groovy"
    lang?.let {
        println("${lang} no es nulo")
    }

    //assertion operator: usarlo si estas seguro que no es null
    println(lang!!)

    //elvis operator: Si es null imprime -1
    lang = null
    println("Usando elvis operator ${lang?:-1}")

}