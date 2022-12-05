package loops

fun main(args: Array<String>) {
    numerosPares()
}

fun numerosPares(){
    for (i in 100..200) {
        if (i%2 == 0){
            println(i)
        }
    }

}