package NamedParameters

fun main() {
    var emi = nombreCompleto(nombre = "Emily",apellido = "gonzalez",edad = 22)
    println(emi)
    var p = nombreCompleto(nombre = "Pau",apellido = "Arjona")
    println(p)
}

fun nombreCompleto (apellido: String,edad: Int = 18,nombre: String):String {
    return "Nombre: $nombre  Apellido: $apellido Edad:$edad"
}