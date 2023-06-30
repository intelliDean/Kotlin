package functions

fun main() {
    println(
        max(23, 65)
    )
    println(
        maxim(219, 165)
    )
}

fun max(num1: Int, num2: Int): Int {
    return if (num1 > num2)
        num1
    else
        num2
}
fun maxim(num1: Int, num2: Int) = if (num1 > num2) num1 else num2


