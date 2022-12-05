package loops

fun main(args: Array<String>) {

    mostrarMenu()
    var opcionEsperada = readLine()!!.toInt()
    menuSelect(opcionEsperada)
    println("Gracias por utilizar la calculadora")
}

fun mostrarMenu(){
    println("**********************************")
    println("***Bienvenidxs a la calculadora***")
    println("**********************************")
    println("SELECCIONE UNA OPCION VALIDA:")
    println("1 - SUMAR\n2 - RESTAR\n3 - MULTIPLICAR\n4 - DIVIDIR\n5 - SALIR")
}
fun menuSelect(opcion: Int){

    do {
        cicloWhen(opcion)
    }while (opcion==5)

}
fun suma(){
    println("selecciones dos numeros:")
    var valor1 = readLine()!!.toInt()
    var valor2 = readLine()!!.toInt()
    var resultado = valor1 + valor2
    println("el valor de la suma es: $resultado")
    }

fun resta(){
    println("selecciones dos numeros:")
    var valor1 = readLine()!!.toInt()
    var valor2 = readLine()!!.toInt()
    var resultado = valor1 - valor2
    println("el valor de la resta es: $resultado")
}

fun multiplicacion(){
    println("selecciones dos numeros:")
    var valor1 = readLine()!!.toInt()
    var valor2 = readLine()!!.toInt()
    var resultado = valor1 * valor2
    println("el valor de la multiplicacion es: $resultado")
}

fun division(){
    println("selecciones dos numeros:")
    var valor1 = readLine()!!.toInt()
    var valor2 = readLine()!!.toInt()
    var resultado = valor1 / valor2
    println("el valor de la division es: $resultado")
}

fun cicloWhen(opcion: Int){
    when(opcion){
        1 -> suma()
        2 -> resta()
        3 -> multiplicacion()
        4 -> division()
    }
}