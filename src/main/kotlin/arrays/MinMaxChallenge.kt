package arrays

fun main() {
    print(select(4, arrayOf(23, 54, 12, 154, 89, 12, 54, 123, 839, 284)))
}

fun max(numbers: Array<Int>): String {
    var  max = Int.MIN_VALUE
    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }
    return "max = $max"
}

fun min(numbers: Array<Int>): String {
    var  min = Int.MAX_VALUE
    for (number in numbers) {
        if (number < min) {
            min = number
        }
    }
    return "min = $min"
}

fun both(numbers: Array<Int>): String {
    var max = Int.MIN_VALUE
    var min = Int.MAX_VALUE

    for (number in numbers) {
        if (number > max) {
            max = number
        }
        if (number < min) {
            min = number
        }
    }
    return "min = $min, max = $max"
}

fun select(choice: Int, numbers: Array<Int>): Any {
    when (choice) {
        1 -> return max(numbers)
        2 -> return min(numbers)
        3 -> return both(numbers)
    }
    return "Invalid selection"
}