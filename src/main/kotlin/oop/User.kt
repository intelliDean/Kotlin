package oop

class User(var name: String, email: String, age: Int) {
    private lateinit var email: String
    private var age: Int

    init {
        validateEmail(email)
        //primitive types like Int and Boolean cannot be initialized late hence you cannot use lateinit
        if (age >= 18) {
            this.age = age
        } else {
            throw IllegalArgumentException("You must be 18 or above")
        }
    }
    //secondary constructor1
    constructor(name: String): this(name, "user@gmail.com", 19)

    //secondary constructor2
    constructor(name: String, email: String): this(name, email, 19)


    private fun validateEmail(email: String) {
        if (email.toCharArray().contains('@') && email.toCharArray().contains('.')) {
            this.email = email
        } else {
            throw IllegalArgumentException("Enter valid email address")
        }
    }

    private fun validateAge(age: Int) {
        if (age >= 18) {
            this.age = age
        } else {
            throw IllegalArgumentException("You must be 18 or above")
        }
    }

    override fun toString(): String {
        return "User(\nname = $name\nemail = $email\nage = $age\n)"
    }

}

