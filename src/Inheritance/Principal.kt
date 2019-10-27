package Inheritance

fun main() {
    var persona = Persona("Ada",25)
    println(persona)
    persona.walking()
    var engineer = Empleado("Sarah",26,2500.00)
    println(engineer)
    engineer.working()
    engineer.walking()
}
