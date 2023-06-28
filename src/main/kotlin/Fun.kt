fun function(name: String, age: Int) {
    var name1 = name    //parameter are immutable. You can assign them to be changed
    name1 = "James"
    println("My name is $name1 and I am $age years old")
}

fun main() {
    function("John", 23)
}