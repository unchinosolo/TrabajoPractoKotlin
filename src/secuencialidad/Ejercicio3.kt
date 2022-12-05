package secuencialidad

fun main(args: Array<String>) {
    println("Indicar cantidad de horas trabajadas:")
    val horasTrabajadas = readLine()!!.toInt()
    println("Indicar precio por hora:")
    val valorPorHora = readLine()!!.toDouble()

    sacarSueldo(horasTrabajadas, valorPorHora)
}

fun sacarSueldo(horasTrabajadas: Int, valorPorHora: Double){
    val sueldo = horasTrabajadas * valorPorHora
    println("Su sueldo es de: $" + sueldo)
}