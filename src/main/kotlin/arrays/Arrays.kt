package arrays

fun arrays(): String {
    val names = arrayOf("Kunle", "Mayowa", "Tayo", "Titi")
    var newName = ""
    for (name in names) {
        if (name.startsWith("T", true)) {
            newName = name
            break
        }
    }
    return newName
}

fun main() {
    val result = arrays()
    println(result)
}

