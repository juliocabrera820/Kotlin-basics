package Lambda

fun main() {
    val multiplicar:(Int,Int) -> Int = {x,y -> x*y}
    mostrarResultado(10,13,multiplicar)
    val conca:(String,String) -> Unit = {x,y -> println("$x version $y")}
    concatenar("Java","8",conca)
}

fun mostrarResultado(a:Int,b:Int,mul:(Int,Int)->Int){
    val res = mul(a,b)
    println("El resultado es $res")
}

fun concatenar(len:String,ver:String,con:(String,String)->Unit):Unit{
    con(len,ver)
}