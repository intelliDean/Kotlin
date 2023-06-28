fun avoidNull () {
    var name: String? = "Michael"
    var name2: String? = null
    /*
    you cannot assign null to any variable without the ?
    and you cannot use the variable without checking for the null possibility
    * */
    println(name?.length)
    name2 = "Dean"
    println(name2!!.length) //this will throw NullPointerException if variable is null
}

fun notNull() {
    var name: String? = null

    name = null  
    var name2 = name?: "name is null" //this means that if name is null, use the value here

    println(name2)
}

fun methods (num: Int) {
    when(num) {
        1 -> avoidNull()
        2 -> notNull()
    }
}

fun main(args: Array<String>) {
   methods(2)
}