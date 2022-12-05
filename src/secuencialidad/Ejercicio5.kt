package secuencialidad

fun main(args: Array<String>) {

    println("Ingrese un valor:")
    val valor = readLine()!!.toInt()
    verificarSiEsPar(valor)

}

fun verificarSiEsPar(numero: Int){
    if (numero % 2 == 0){
        print("Es par")
    }else{
        println("Es impar")
    }
}