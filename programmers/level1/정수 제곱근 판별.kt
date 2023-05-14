class Solution {
    // testCode 18 fail : i*i overflow
    fun solution(n: Long): Long {
        for (i in 1 until n) {
            if (i * i == n) {
                return (i + 1) * (i + 1)
            }
        }
        return -1
    }

    // testCode 18 fail : i*i overflow
    fun solution2(n: Long): Long =
        try {
            ((1 until n).filter { it * it == n }.first() + 1).toDouble().pow(2).toLong()
        } catch (e: NoSuchElementException) {
            -1
        }

    fun solution3(n: Long): Long {
        val nDouble = n.toDouble()
        val sqrt = sqrt(nDouble).toInt()
        return if (sqrt*sqrt == n.toInt()) (sqrt+1).toDouble().pow(2).toLong() else -1
    }

    fun solution4(n: Long): Long {
        val nDouble = n.toDouble()
        val sqrt = sqrt(nDouble)
        return if (sqrt % 1.0 == 0.0) (sqrt+1).pow(2).toLong() else -1
    }
}
