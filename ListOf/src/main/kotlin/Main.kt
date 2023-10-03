fun main(){
    val nombres = listOf(
        "Mario",
        "Luigi",
        "Princesa Peach",
        "Toad",
        "Yoshi",
        "Bowser",
        "Mario"
    )
    println("*** Imprimir nombres con FOR ***")
    for (nombre in nombres) {
        println(nombre)
    }
    println("*** Imprimir nombres con forEach ***")
    nombres.forEach { nombre ->
        println("$nombre")
    }
    println("*** Parar la ejecucion cuando nombre == Toad ***")
    for (nombre in nombres) {
        println(nombre)
        if(nombre=="Toad"){
            println("Personaje encontrado!!!")
            break
        }
    }
    println("*** Contar el numero de veces que aparece un elemneto*** ")
    var n = countName("Mario",nombres)
    println("El nombre Mario aparece $n veces en la lista")

}
fun countName(name:String , nombres:List<String>):Int{
    var count = 0;
    for(currentName in nombres){
        if(name in currentName){
            count ++
        }
    }
    return count
}