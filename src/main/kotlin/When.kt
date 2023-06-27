fun switch() {
    val number = 23
    when (number) {
       14 -> println("Number is $number")
        18 -> println("Number is $number")
        23 -> println("Number is $number")
    }
}

fun rangeSwitch() {
    val number = 12
    when (number) {
       in 1 .. 20 -> println("Number is $number")
       else -> println("Number is $number")
    }
}

fun main(args: Array<String>) {
    //switch()
    rangeSwitch()
}