package Interface

class Rectangulo(base:Int,altura:Int):Figura {
    private var base = base
    get() = field
    set(value) {field = value}
    private var altura = altura
    get() = field
    set(value) {field = value}

    override fun dibujar() {
        println("Dibujando un rectangulo")
    }

    override fun area(): Double {
        return base*altura.toDouble()
    }
}