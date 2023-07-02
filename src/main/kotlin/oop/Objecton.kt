package oop

object Objecton {
    init {
        println("Objecton created")
    }
    /*
    * this is a very easy way to create a singleton
    * the object is created only once and returns the created object always after the first creation
    * */
}

fun main() {
    val objecton1 = Objecton
    val objecton2 = Objecton
    val objecton3 = Objecton
    val objecton4 = Objecton
    val objecton5 = Objecton
    val objecton6 = Objecton
    val objecton7 = Objecton
    val objecton8 = Objecton
    val objecton9 = Objecton

    println(objecton1)
    println(objecton2)
    println(objecton3)
    println(objecton4)
    println(objecton5)
    println(objecton6)
    println(objecton7)
    println(objecton8)
    println(objecton9)
}