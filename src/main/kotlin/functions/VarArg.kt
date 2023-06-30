package functions

fun main() {
    println(multipleArgs(2, 43, 5, 12, 53, 5))
}

fun multipleArgs(vararg numbers: Int): Int {
    var result: Int = 0
    for (number in numbers) {
        result += number
    }
    return result
}