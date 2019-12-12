package WithApply

class Persona(nombre:String,edad:Int){
    var nombre = nombre
    get() = field
    set(value) { field = value }
    var edad = edad
    get() = field
    set(value) {field = value}

    override fun toString(): String {
        return "Nombre $nombre Edad $edad"
    }

}