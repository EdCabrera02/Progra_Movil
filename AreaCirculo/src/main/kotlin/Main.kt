import kotlin.math.pow
const val PI = 3.1416f

fun circleArea(radius:Float):Float{
    return PI * radius.pow(2)
}
fun main(){
    val radius = 4f

    println("El area del circulo es ${circleArea(radius)}")
}   