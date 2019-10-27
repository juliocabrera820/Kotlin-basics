package Map

fun main() {

    var langs:MutableMap<String,String> = mutableMapOf()
    langs.put("Java",".java")
    langs.put("GO",".go")
    langs.put("Ruby",".rb")
    langs.put("Kotlin",".kt")
    langs.put("Python",".py")
    langs.put("Javascript",".js")
    langs.forEach { (k,v)-> println("Clave $k valor $v")}
}
