package loops

fun main(args: Array<String>) {
    println("Indique un valor")
    var x = readLine()!!.toInt()

    factorial(x)


}

fun factorial(x: Int){
    var e = 1

    for (i in x downTo 1){
        e*=i
    }

    print(e)
}