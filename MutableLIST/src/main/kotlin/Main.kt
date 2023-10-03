fun main(){
    //Lista NO mutable
    val numeros = listOf("Uno","Dos","TRES", "Cuatro", "Cinco")
    println(numeros)
    println("Numero de elementos: ${numeros.size} ")
    println("Segundo elemento: ${numeros.get(1)}")
    println("Cuarto elemento: ${numeros[3]}")
    println("Ultimo elemento: ${numeros.get(numeros.size-1)}")
    println("Index del elemento \"Cuatro\": ${numeros.indexOf("Cuatro")}")

    //Lista mutable
    val list = mutableListOf(1, 2, 3, 4)
    //ADD
    list.add(5)
    //REMOVE
    list.removeAt(1)
    //CHANGE
    list[0]=0
    print(list)
}