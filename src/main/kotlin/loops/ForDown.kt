package loops

fun main () {
    pick(2)
}

fun pick(num:Int) {
    when(num) {
        1 -> forDown()
        2 -> foreDown()
    }
}

fun forDown() {
    for (i in 10 downTo 1) {
        println(i)
    }
}
fun foreDown() {
    for (i in 20 downTo 0 step 2) {
        println(i)
    }
}