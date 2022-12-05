package secuencialidad

fun main(args: Array<String>) {
    aplicandoDescuento()
}

fun aplicandoDescuento(){
    println("Ingresar precio:")
    var precio = readLine()!!.toDouble()
    println("Ingresar codigo de descuento:")
    var codigo = readLine()!!.toInt()

    if (codigo == 1){
        precio = precio / 1.20
        println("El precio con descuento es: $precio")
    }else{
        println("No se ha aplicado descuento, valor: $precio")
    }
}