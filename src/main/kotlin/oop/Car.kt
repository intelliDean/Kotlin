package oop

class Car {
    private var firstName: String = ""
    private var lastName: String = ""
    private var phoneNumber: String = ""
    private var age: Int = 0


    fun setFirstName(firstName: String) {
        this.firstName = firstName
    }

    fun getFirstName(): String {
        return firstName;
    }

    fun setLastName(lastName: String) {
        this.lastName = lastName
    }

    fun getLastName(): String {
        return lastName
    }

    fun setPhoneNumber(phoneNumber: String) {
        this.phoneNumber = phoneNumber
    }

    fun getPhoneNumber(): String {
        return phoneNumber
    }

    fun setAge(age: Int) {
        this.age = age
    }

    fun getAge(): Int {
        return age
    }


}

fun main() {
    val car = Car()

    car.setFirstName("Michael")
    car.setLastName("Dean")

    println(car.getFirstName()  )
}