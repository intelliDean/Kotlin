package arrays

fun main() {
    println(
        getMaxOrMin(
            choice.MAX,
            arrayOf(
                23, 54, 26, 87, 9, 34, 90, 12, 56, 79
            )
        )
    )
}

fun getMaxOrMin(findBy: choice, numbers: Array<Int>): Int {
    when (findBy) {
        choice.MAX -> {
            var max = Int.MIN_VALUE
            for (number in numbers) {
                if (number > max) {
                    max = number
                }
            }
            return max
        }

        choice.MIN -> {
            var min = Int.MAX_VALUE
            for (number in numbers) {
                if (number < min) {
                    min = number
                }
            }
            return min
        }
    }
}

enum class choice {
    MIN,
    MAX
}




