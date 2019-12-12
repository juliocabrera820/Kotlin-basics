package Collections

fun main() {
    var equipos = mutableListOf<Equipo>()
    var agui = Equipo("Aguilas",200,100)
    var tig = Equipo("Tigres",200,100)
    var ray = Equipo("Rayos",150,15)
    var del = Equipo("Delfines",150,15)
    var leo = Equipo("Leones",150,15)
    equipos.add(agui)
    equipos.add(tig)
    equipos.add(ray)
    equipos.add(del)
    equipos.add(leo)

    println("Ordenar por criterios")
    equipos.sortWith(compareBy({it.aproximacion},{it.tiempo},{it.nombre}))
    println("Ordenados")
    equipos.forEach { println(it) }

    var agrupado =  equipos.groupingBy { it.nombre.contains("a") }.eachCount()
    println("Equipos agrupados que contienen la letra")
    println(agrupado)
    var agrupados = equipos.filter { it.nombre.contains("a") }.toList()
    println("Lista que contienen la letra a")
    agrupados.forEach { println(it) }
}