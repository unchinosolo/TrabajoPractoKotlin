package secuencialidad

fun main(args: Array<String>) {
    menu()

}

fun menu(){
    println("Ingresar el primer número")
    val num1 = readLine()!!.toInt()
    println("Ingresar el segundo número")
    val num2 = readLine()!!.toInt()
    println("Ingresar el tercer número")
    val num3 = readLine()!!.toInt()

    determinarMayor(num1, num2, num3)
}

fun determinarMayor(num1: Int, num2: Int, num3: Int){
    if (num1 > num2 && num1 > num3){
        println("El mayor número fue: $num1")
    }else if (num2 > num1 && num2 > num3) {
        println("El mayor número fue: $num2")
    }else{
        println("El mayor número fue: $num3")
    }
}

