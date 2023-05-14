fun solution(n: Long): IntArray {
        var answer = mutableListOf<Long>()
        var input = n
        while (input>0) {
            answer.add(input%10)
            input/=10
        }
        return answer.map { it.toInt() }.toIntArray()
    }

fun solution2(n: Long): IntArray = n.toString().reversed().map { it.toString().toInt() }.toIntArray()
