package functions

fun main() {
    default2(age = 23, name = "Dean")
}


fun default2(name: String = "", age: Int = 0) {
    println("$name is $age years old")
}