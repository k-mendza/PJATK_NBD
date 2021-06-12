package com.nbd
package com.nbd.cw1.zad9

//Zdefiniuj funkcję, przyjmującą listę liczb całkowitych i zwracającą wygenerowaną na jej podstawie
//listę, w której wszystkie liczby zostały zwiększone o 1. Wykorzystaj mechanizm mapowania kolekcji.
object Zad9 {
  private val intList = List(0, 1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6, 0, 7, 0, 8, 0, 9)

  def mapIntList(list: List[Int]): List[Int] = {
    list map (value => value + 1)
  }

  def main(args: Array[String]): Unit = {
    println(mapIntList(intList))
  }
}
