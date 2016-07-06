// http://codeforces.com/problemset/problem/688/A

import java.util.Scanner

object MainApp {
  def readDays(d: Int, scanner: Scanner): List[String] =
    d match {
      case 0 => Nil
      case d => {
        val value = scanner.nextLine()
        value :: readDays(d - 1, scanner)
      }
    }

  def isWin(day: String): Boolean =
    day exists (_ == '0')

  def pack(xs: List[Boolean]): List[List[Boolean]] =
    xs match {
      case Nil => List(Nil)
      case x :: xs => pack(xs) match {
        case Nil => List(List(x))
        case y :: ys => y match {
          case Nil => List(x) :: ys
          case z :: zs if (x == z) => (x :: y) :: ys
          case z :: zs => List(x) :: y :: ys
        }
      }
    }

  def main(args: Array[String]): Unit = {
    val scanner = new Scanner(System.in)
    val n = scanner.nextInt()
    val d = scanner.nextInt()
    scanner.nextLine()
    val days = readDays(d, scanner)
    val wins = pack(days map isWin) filter (_.head) map (_.length)
    if (wins.isEmpty)
      println(0)
    else
      println(wins.max)
  }
}
