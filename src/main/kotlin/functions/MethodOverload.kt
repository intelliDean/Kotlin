package functions

fun methodOverload(num1: Int, num2: Int): Int {
    return if (num1 > num2) {
        num1
    } else {
        num2
    }
}

fun methodOverload(num1: Double, num2: Double): Any {
    return if (num1 > num2) {
        num1
    } else {
        num2
    }
}

fun methodOverload(num1: Int, num2: Double): Any {
    return if (num1 > num2) {
        num1
    } else {
        num2
    }
}

fun methodOverload(num1: Double, num2: Int): Any {
    return if (num1 > num2) {
        num1
    } else {
        num2
    }
}

fun switch(num:Int): Any {
    val result: Any = when (num) {
        1 ->  methodOverload(23, 76)
        2 ->  methodOverload(12.0, 46.0)
        3 -> methodOverload(24, 43.0)
        4 ->  methodOverload(21.0, 70)
        else -> "Number not exist"
    }
    return result
}

fun main() {
    println(switch(3))
}




