package Interface

fun main() {
    var rec = Rectangulo(7,5)
    rec.dibujar()
    println("area del rectangulo es ${rec.area()}")
    var cir = Circulo(5)
    cir.dibujar()
    println("area del circulo es ${cir.area()}")
}
