package secuencialidad

fun main(args: Array<String>) {
    println("Ingrese un nombre:")
    val nombre = readLine()
    println("Ingrese su edad:")
    val edad = readLine()!!.toInt()

    println("La persona $nombre tiene $edad años")
}