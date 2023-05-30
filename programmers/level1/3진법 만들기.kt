package kotlinstudy

// n max 1억
fun solution(n: Int): Int {
    val N = 3
    var answer: Int = 0
    var input = n

    while(input != 0) {
        answer *= N
        val remain = input%N
        input/=N
        answer += remain
    }

    return answer
}

fun solution2(n: Int): Int {
    val N = 3
    return sequence {
        var input = n
        while (input != 0) {
            yield(input % N)
            input /= N
        }
    }.fold(0) { acc, digit -> acc * N + digit }
}

fun solution3(n: Int): Int = n.toString(3).reversed().toInt(3)

fun main() {
    println(solution(45)) //7
    println(solution(125)) //229
}
