package loops

fun main(args: Array<String>) {
    
    generarTablas()

}
fun generarTablas(){
    var resultado = 1
    var valor = 1
    repeat(9){
        for (i in 1..9){
            resultado = i * valor
            print("$resultado  ")

        }
        println("\n")
        valor++
    }

}