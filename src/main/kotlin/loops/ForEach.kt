package loops

fun main() {
    loops(23, 54, 43, 76, 32, 54, 76)
}

fun loops(vararg numbers: Int) {
    numbers.forEach{
        num -> println(num * 3)
    }
}