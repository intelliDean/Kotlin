package functions

fun main() {
    checkGender(Gender.FEMALE, "Sukura")
}

fun print4Man(name: String) {
    println("Your name is ${name.uppercase()} and you are a male")
}
fun print4Female(name: String) {
    println("Your name is ${name.uppercase()} and you are a female")
}

fun checkGender(gender: Gender, name: String) {
    if (gender == Gender.MALE) {
        print4Man(name)
    } else {
        print4Female(name)
    }
}


enum class Gender {
    MALE, FEMALE
}