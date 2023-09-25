
//esta clase tiene dos propiedades: 'X' y 'Y', que representan coordenadas
data class Punto(val x: Double, val y: Double)
//Pendiente (m)= //x2−x1
//                ------
//                 y2−y1
fun calcularPendiente(p1: Punto, p2: Punto): Double = (p2.y - p1.y) / (p2.x - p1.x)

fun main() {
    //creacion de objetos
    val punto1 = Punto(4.0, 3.0)
    val punto2 = Punto(-3.0, -2.0)
    //resultado
    val pendiente = calcularPendiente(punto1, punto2)
    println("La pendiente es: $pendiente")
}

/*
const val P1_X = 4
const val P1_Y = 3
const val P2_X = -3
const val P2_Y = -2
fun main(){
    val pendiente = (P2_X-P1_X)/(P2_Y-P1_Y)
    println("La pendiente es: $pendiente")
}
*/