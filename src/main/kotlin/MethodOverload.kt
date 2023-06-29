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

fun main() {
    println(methodOverload(23.5, 8.0))
}




