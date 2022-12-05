package secuencialidad

fun main(args: Array<String>) {
    println("Indique el valor del medicamento:")
    var valor = readLine()!!.toDouble()
    aplicadorDeDescuentos(valor)
}

fun aplicadorDeDescuentos(valor: Double){

    if (valor < 55.0){
        var valor = valor-((valor*4.5)/100)
        print("El precio con descuento es: $valor")
    }else if (valor in 55.0..100.0){
        var valor = valor-((valor*8)/100)
        print("El precio con descuento es: $valor")
    }else{
        var valor = valor-((valor*10.5)/100)
        print("El precio con descuento es: $valor")
    }
}