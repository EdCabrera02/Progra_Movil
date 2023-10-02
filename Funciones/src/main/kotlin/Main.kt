import kotlin.math.pow

const val PHI = 1.618f
const val PI = 3.1416f

fun main() {
    val radioCirculo =4f
    val areaCirculo = circleArea(radioCirculo)

    println("El área del círculo es: $areaCirculo")

    printName("Edson Cabrera")
    printAge(21)
    getPi()
    printPHI()
}

fun circleArea(radioCirculo:Float):Float{
    return PI*radioCirculo.pow(2)
}

fun printName(name:String){
    println("Mi nombre es $name")
}

fun printAge(age:Int){
    println("Tengo $age años")
}

fun getPi():Float{
    return PI;
}

fun printPHI() {
    println("Valor del número aureo: $PHI")
}