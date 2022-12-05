package funciones

/*En el mundo de la física, tenemos las siguientes formulas:
o velocidad = distancia / tiempo
o distancia = velocidad * tiempo
o tiempo = distancia / velocidad
Haciendo uso de funciones lambdas, realizar tres funciones para calcular:
a. La velocidad dada una distancia y un tiempo.
b. La distancia dada una velocidad y un tiempo.
c. El tiempo dada una distancia y una velocidad.
*/

fun main() {
    val velocidad = {distance: Int, time: Int -> distance.div(time)}
    val distancia = {speed: Int, time: Int -> speed.times(time)}
    val tiempo = {distance: Int, speed: Int -> distance.div(speed)}


        fun operar(v1: Int, v2: Int, fn: (Int, Int) -> Int) : Int {
            return fn(v1, v2)
        }
        println(operar(30,10,velocidad))



    println("La velocidad es de: ${velocidad(20,3)}, recorrio ${distancia(60,20)} mts de distancia " +
            "y el tiempo que tarda es de: ${tiempo(distancia(60,20),velocidad(20,3))} minutos")
}