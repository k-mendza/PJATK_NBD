package com.nbd
package com.nbd.cw1.zad10

//Stwórz funkcję przyjmującą listę liczb rzeczywistych i zwracającą stworzoną na jej podstawie
//listę zawierającą wartości bezwzględne elementów z oryginalnej listy należących do przedziału <-5,12>.
//Wykorzystaj filtrowanie.
object Zad10 {
  private val doubleList = List(1.0, -1.1, 1.2, -1.3, 1.4, -1.5, -5, 12, -6, 13)

  def getModulus(list: List[Double]): List[Double] = {
    list.filter(v => v >= -5)
      .filter(v => v <= 12)
      .map(v => Math.sqrt(v*v))
  }

  def main(args: Array[String]): Unit = {
    println(getModulus(doubleList))
  }
}
