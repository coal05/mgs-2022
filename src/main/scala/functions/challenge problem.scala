package functions

object challengeproblem {

  def triples(n: Int): List[List[Int]] = {
    for {
      a <- (1 to n).toList
      b <- (1 to n).toList
      c <- (1 to n).toList
      if (a * a + b * b == c * c)
    } yield List(a, b, c)
  }

  def main(argv: Array[String]): Unit = {
    println(triples(100))
  }
}
