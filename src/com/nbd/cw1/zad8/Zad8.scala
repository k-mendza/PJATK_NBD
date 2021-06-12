package com.nbd
package com.nbd.cw1.zad8

//Napisz funkcję usuwającą zera z listy wartości całkowitych (tzn. zwracającą listę elementów mających wartości różne od 0). Wykorzystaj rekurencję.
object Zad8 {
  private val intList = List(0, 1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6, 0, 7, 0, 8, 0, 9)

  def removeZeros(list: List[Int], n: Int): List[Int] = list match {
    case Nil => Nil
    case h :: t =>
      if (h == n)
        removeZeros(t, n) // 0 found, skip it and iterate the tail
      else
        h :: removeZeros(t, n)
  }

  def main(args: Array[String]): Unit = {
    println(removeZeros(intList, 0))
  }
}
