package loops

fun main(args: Array<String>) {
    println("Indique un valor")
    var x = readLine()!!.toInt()

    suma(x)


}

fun suma(x: Int){
    var e = 0

    for (i in x downTo 0){
        e+=i
    }

    print(e)
}

