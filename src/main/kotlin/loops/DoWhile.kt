package loops

fun main() {
    doWhile()
}

fun doWhile() {
    var i: Int = 0
    do {
        println(i++)
    } while (i <= 10)
}