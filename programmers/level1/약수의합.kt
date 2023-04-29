package programmers.level1

fun solution(n: Int): Int {
    var answer = 0
    for (i in (1..n)) {
        answer += if (n % i == 0) i else 0
    }
    return answer
}

fun solution2(n: Int) = (1..n).filter { n%it == 0 }.sum()

fun main() {
    println(solution2(12))
}
