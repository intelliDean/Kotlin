package loops

fun main() {
   switch(2)
}

fun switch(num:Int) {
    when(num) {
        1 -> inLoop()
        2 -> initLoop()
    }
}

fun inLoop() {
    for (i in 1..20) {
        println(i)
    }
}
fun initLoop() {
    for (i in 1..20 step 2) {
        println(i)
    }
}