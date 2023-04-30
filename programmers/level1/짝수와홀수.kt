package programmers.level1

fun solution(num: Int) = if (num % 2 == 0) "Even" else "Odd"
fun solution2(num: Int) = if (num.and(1) == 0) "Even" else "Odd"

fun main() {
    println(solution(3))
}
