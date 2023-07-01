package oop

class Human(
    private var name: String,
    private var phoneNumber: String,
    private var email: String,
    private var age: Int,
    private var password: String
) {
    fun getPhoneNumber(): String {
        return phoneNumber
    }

    fun getName(): String {
        return name
    }

    fun getEmail(): String {
        return email
    }

    fun getAge(): Int {
        return age
    }

    override fun toString(): String {
        return "Human(" +
                "\nname = $name" +
                "\nphoneNumber = $phoneNumber" +
                "\nemail = $email" +
                "\nage = $age" +
                "\npassword = $password" +
                "\n)"
    }


}

fun main() {
    val human: Human = Human(
        "Michael",
        "08095729090",
        "hello@gmail.com",
        12,
        "password123"
    )

    println(human)
}