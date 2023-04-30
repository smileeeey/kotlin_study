fun solution(n: Int): Int {
  var answer: Int = 0

  val target = n-1

  for (x in 2 until n) {
      if (target % x == 0) {
          return x
      }
  }

  return answer
}

fun solution2(n: Int): Int = (2..n).first { n % it == 1 }
