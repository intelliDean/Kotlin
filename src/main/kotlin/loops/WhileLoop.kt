package loops

fun main() {
    whileLoop(2)
}

fun whileLoop(num: Int) {
    var numb = num
    while (numb <= 10) {
        println(numb)
        numb++
    }
}