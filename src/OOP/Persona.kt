package OOP

class Persona (name:String,age:Int) {
    var name:String = name
    get()=field
    set(value){field = value}
    var age:Int = age
    get()=field
    set(value) {field = value}

    override fun toString(): String {
        return "Nombre $name Edad $age "
    }

}
