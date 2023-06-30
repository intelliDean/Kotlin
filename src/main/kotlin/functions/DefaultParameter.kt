package functions

fun main() {
    default(12)
}

//Default parameter is usually the last of the parameters
fun default(name: String = "King") {
    println("Your name is $name")
}
fun default(age: Int = 0, name: String = "King") {
    println("Your name is $name  and you are $age years old" )
}