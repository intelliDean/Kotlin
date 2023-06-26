import java.util.*
import kotlin.math.sqrt

object PrimeNumber {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Enter number to check its prime")
        val input = Scanner(System.`in`)
        primeNumber(40)
    }

    private fun primeNumber(rangeNumber: Int) {
        var i = 2
        while (i <= rangeNumber) {
            if (isPrime(i)) {
                print("$i ")
            }
            i++
        }
    }

    private fun isPrime(number: Int): Boolean {
        require(number > 1) { "1 is neither prime nor composite" }
        val sqrtOfNumber = sqrt(number.toDouble()).toInt()
        for (i in 2..sqrtOfNumber) {
            if (number % i == 0) {
                return false
            }
        }
        return true
    }
}
