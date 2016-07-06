import java.util.Scanner

object MainApp {
  def isEvenPalindrome(n: List[Char]): Boolean =
    n match {
      case Nil => true
      case x if n.length % 2 != 0 => false
      case x :: xs => if (n.head == n.last) isEvenPalindrome(xs.init) else false
    }

  def generatePalindromes(last: Int): Seq[(Int, String)] = {
    (1 to last) zip {
      for (
        x <- 1 to last if isEvenPalindrome(x.toString.toList)
      ) yield x.toString
    }
  }

  def main(args: Array[String]) = {
    val n = new Scanner(System.in).nextLine()
    println(n ++ n.reverse)
//    println(generatePalindromes(1000000000))
  }
}
