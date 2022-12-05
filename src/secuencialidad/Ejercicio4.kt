package secuencialidad

fun main(args: Array<String>) {

    println("Ingrese nota 1: \n")
    val nota1 = readLine()!!.toInt()
    println("Ingrese nota 2: \n")
    val nota2 = readLine()!!.toInt()
    sacarPromedio(nota1, nota2)

}

fun sacarPromedio(nota1: Int, nota2: Int){
    val promedio = (nota1 + nota2) / 2.0
    println("El promedio es: $promedio")

}