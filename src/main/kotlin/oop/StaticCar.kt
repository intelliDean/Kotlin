package oop

class StaticCar {
    companion object {
        fun accelerate(): String {
            return "Car is moving"
        }
        var number = 230
        fun brake(): String {
            return "Car has stopped"
        }

        fun start(): String {
            return "Car has started"
        }
    }
}

fun main() {
    val response1 = StaticCar.accelerate()
    val response2 = StaticCar.brake()
    val response3 = StaticCar.start()
    val response4 = StaticCar.number

    println(response1)
    println(response2)
    println(response3)
    println(response4)
}