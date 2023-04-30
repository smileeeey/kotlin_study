package programmers.level1

fun solution(numbers: IntArray): IntArray {
    var answer = mutableListOf<Int>()

    val size = numbers.size

    for ((index, number) in numbers.withIndex()) {
        for (index2 in index + 1 until size) {
            answer.add(number + numbers[index2])
        }
    }

    return answer.toSortedSet().toIntArray()
}

fun solution2(numbers: IntArray): IntArray {
    val list = numbers.toList().withIndex()

    return list.flatMap { i -> list.map { j -> i to j } }
        .filter { it.first.index != it.second.index }
        .map { it.first.value + it.second.value }
        .toSortedSet()
        .toIntArray()
}

fun main() {
    println(solution2(intArrayOf(2, 1, 3, 4, 1)))
}
