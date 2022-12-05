package funciones

/*Mejorar el ejercicio anterior para poder resolver los cálculos en una única función de
orden alto.*/
fun main() {

    fun area(base: Int, altura: Int) = base * altura
    fun operar(v1: Int, v2: Int, fn: (Int, Int) -> Int): Int {
        return fn(v1, v2)
    }
    println(operar(20, 30, ::area))

}