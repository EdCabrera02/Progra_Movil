import Clases.*
import java.security.interfaces.DSAPublicKey

fun main() {
    //val travel = Travel
    val viajeMonterrey = National("Monterrey")
    viajeMonterrey.quotePrice(2)
    val viajeBajaMonterrey = NationalLowSeason("Monterrey")
}

fun getDiscount(price: Double, coupon: String, calculateDiscount: (Double, String) -> Double): Double {
    return calculateDiscount(price, coupon)
}