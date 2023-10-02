fun main(){
    var x = 20
    while(x>0){
        println(x)
        x--
    }
    do{
        println("En este punto x=0, y la condición es que x>0, por lo tanto el bloque\n" +
                "de instrucciones se ejecuta 1 vez sin importar si se cumple o no la condición")
        println(x)
        x--
    }while(x>0)
}