package arrays

import java.util.Arrays

fun main() {
    isInt(arrayOf(2, 1, 5, 3, 7, 4, 3, 6, "name", false, "age", 'q', true))
}

fun isInt(array: Array<Any>) {
    for (number in array) {
        if (number is Int) {
            println(number)
        }
    }
}