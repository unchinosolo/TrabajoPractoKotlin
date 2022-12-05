package loops

fun main(args: Array<String>) {
    println("Indique un valor:")
    var valor = readLine()!!.toInt()
    imprimirHolamundo(valor)

}

fun imprimirHolamundo(valor: Int){
    repeat(valor){
        println("Hola Mundo")
    }

}