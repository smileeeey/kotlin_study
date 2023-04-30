fun solution(x: Int, n: Int): LongArray {
    var answer = mutableListOf<Long>()
    var sum: Long = x.toLong()

    for (index in 1..n) {
        answer.add(sum)
        sum += x
    }

    return answer.toLongArray()
}

fun solution2(x: Int, n: Int): LongArray = LongArray(n) { x.toLong() * (it + 1) }
