import java.math.BigDecimal

fun main() {
    println(
        methodAsParam("Michael")
    )
    println()
    println(
        methodAsParam(
            salary = BigDecimal(2305959),
            name = "John",
            position = roles.ADMIN
        )
    )
}

fun methodAsParam(
    name: String,
    position: roles = roles.STAFF,
    salary: BigDecimal = salary()
): String {
    return String.format(
        "Name: $name\nRole: $position\nSalary: $salary"
    )
}


fun salary (): BigDecimal {
   return BigDecimal.valueOf(230000)
}
enum class roles {
    ADMIN,
    HR,
    STAFF
}
