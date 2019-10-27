package Inheritance

class Empleado(name:String,age:Int,salary:Double): Persona(name,age) {
    var salary:Double = salary
    get() = field
    set(value) {if(value>0) field = value}

    override fun toString(): String {
        return super.toString()+" Salario $salary"
    }

    override fun walking() {
        print("Empleado caminando")
    }

    fun working(){
        println("Empleado trabajando")
    }
}
