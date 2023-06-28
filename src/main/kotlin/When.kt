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

fun holder() {
    val num1 = 23
    val num2 = 43

    println("$num1 + $num2 = ${num1 + num2}")
}

fun oneHolder() {
    val age = 23
    val name = "John"

    println("My name is $name and I am $age years old")
}

fun doubleHolder() {
    val number1 = 43
    val number2 = 89
    val number3 = 84
    val number4 = 78

    println(
        "$number1 + $number2 + $number3 + $number4 = ${number1 + number2 + number3 + number4}"
    )
}

fun abbrev() {
    var num1 = 34
    var num2 = 56

    num1 += num1 + 32
    num2 += 23

    println(num1)
    println(num2)
}

fun main(args: Array<String>) {
    //switch()
    //rangeSwitch()
    //holder()
//    oneHolder()
    //doubleHolder()
    abbrev()
}