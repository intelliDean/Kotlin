package loops

fun main () {
    onlyEven(23, 43, 1, 43, 7, 4, 8, 5, 89, 3, 2, 54, 23,12, 43,5, 45,6,46,6,3,3,12,4)
}

fun onlyEven(vararg numbers: Int) {
    var totalEven = 0
    for (number in numbers) {
        if (isOdd(number)) {
            continue
        }
        print("$number ")
        totalEven++
    }
    println("\nTotal number of even numbers are $totalEven")
}

fun isOdd(number: Int) = number % 2 != 0