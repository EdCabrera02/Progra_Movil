const val baseRectangulo= 10f
const val alturaRectangulo= 5f
const val anchoRectangulo= 5f

fun main(){
    val areaRectangulo = areaRectangulo(baseRectangulo,alturaRectangulo)
    val volumenRectangulo = volumenRectangulo(anchoRectangulo)
    println("El area del rectangulo es: $areaRectangulo")
    print("El volumen del prisma es: $volumenRectangulo")
}
fun areaRectangulo(baseRectangulo:Float, alturaRectangulo:Float):Float{
    return baseRectangulo*alturaRectangulo
}
fun volumenRectangulo(anchoRectangulo:Float):Float{
    return areaRectangulo(baseRectangulo,alturaRectangulo)*anchoRectangulo
}