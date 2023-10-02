const val lado1 = 7f
const val lado2 = 12f
const val lado3 = 9f

fun main(){
        if (lado1 == lado2 && lado2 == lado3) {
            println("Es un triángulo equilátero.")
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            println("Es un triángulo isósceles.")
        } else {
            println("Es un triángulo escaleno.")
        }
}