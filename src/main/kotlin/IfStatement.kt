fun ifStatement() {
    val name = "Jordan"
    val age = 12

    val result =
         if (name == "Jordan" && age == 12) "This is correct"
        else "This is incorrect"
    println(result)
}

fun main() {
    ifStatement()
}