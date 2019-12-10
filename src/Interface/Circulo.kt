package Interface

class Circulo(radio:Int) :Figura{
    private var radio = radio
    get()=field
    set(value){field=value}

    override fun dibujar() {
        println("Dibujando un circulo...")
    }

    override fun area(): Double {
        return Math.PI*Math.pow(radio.toDouble(),2.0)
    }
}