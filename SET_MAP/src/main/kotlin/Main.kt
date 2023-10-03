fun main(){
    //SET
    val numSet: Set<Int> = setOf(0,1,2,3,4,5)
    val reverseNumSet: Set<Int> = setOf(5, 4, 3, 2, 1, 0)
    if(numSet == reverseNumSet){
        println("Ambos SET son iguales")
    }
    //MUTABLE
    var names: Set<String> = mutableSetOf("Nombre 1","Nombre 2")
    //MAP
    val namesToAges: Map<String, Int> = mapOf("user_one" to 20, "user_two" to 23)
    println(namesToAges["user_one"])
}