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
        in 1..20 -> println("Number is $number")
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

//switch between methods
fun switchMethods(num1: Int) {
    when (num1) {
        1 -> switch()
        2 -> rangeSwitch()
        3 -> holder()
        4 -> oneHolder()
        5 -> doubleHolder()
        6 -> abbrev()
        else -> println("$num1 has no link")
    }
}

fun switchRange(num1: Int, num2: Int) {
    when (num1) {
        in 1..4 -> switchMethods(num2)
        else -> switchRange(2, num2)
    }
}

fun rangeExp(num: Int) {
    when {
        num <= 10 -> switchMethods(3)
        num >= 10 || num <= 20 -> switchRange(2, num)
        num >= 30 || num <= 40 -> switchRange(2, 4)
    }
}


fun main(args: Array<String>) {
    //switch()
    //rangeSwitch()
    //holder()
//    oneHolder()
    //doubleHolder()
    //abbrev()

    //switchMethods(7)
    //switchRange(6, 4)
    rangeExp(23)
}