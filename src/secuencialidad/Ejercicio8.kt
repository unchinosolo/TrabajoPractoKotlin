package secuencialidad

fun main() {

    println("Ingresar numero de catalogo:")
    val numeroDeCatalogo = readLine()!!.toInt()

    verificarNumeroDeCatalogo(numeroDeCatalogo)
}

fun verificarNumeroDeCatalogo(numero: Int){

    if (numero in 12121..18081 || numero in 30012..45565 || numero in  67000..68000){
        println("Tractor con defecto")
    }else if (numero in 1200..90000){
        println("Tractor sin defecto")
    }else{
        println("FUERA DE CATALOGO")
    }
}
