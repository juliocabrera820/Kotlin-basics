package ExtensionFunctions

class Persona (nombre:String,edad:Int){
    var nombre = nombre
    var edad = edad
    override fun toString(): String {
        return "Nombre $nombre Edad=$edad)"
    }
}