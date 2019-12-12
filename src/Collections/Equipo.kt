package Collections

class Equipo (nombre:String,aproximacion:Int,tiempo:Int){
    var nombre = nombre
    var aproximacion = aproximacion
    var tiempo = tiempo
    override fun toString(): String {
        return "Nombre $nombre aproximacion $aproximacion tiempo $tiempo"
    }

}