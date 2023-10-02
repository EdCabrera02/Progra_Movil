fun main(){
    verifyAge()
}
fun verifyAge(){
    print("Ingresa tu edad y presiona enter (escribe solo el número): ")
    val age = readLine()?.toInt()
    if(age != null && age >= 18) {
        println("Ya eres mayor de edad!")
    }else{
        println("Aun eres menor de edad")
    }
}