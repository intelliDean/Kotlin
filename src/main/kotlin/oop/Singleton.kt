package oop

class Singleton private constructor() {
    companion object {
        private var instance: Singleton? = null

        fun getInstance(): Singleton? {
            if (instance == null) {
                instance = Singleton()
            }
            return instance!!
        }
    }


}

fun main() {
    val single = Singleton.getInstance()
    println(single)

    val married = Singleton.getInstance()
    println(married)

    val divorced = Singleton.getInstance()
    println(divorced)
}