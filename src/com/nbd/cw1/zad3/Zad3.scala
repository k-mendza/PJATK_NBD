package com.nbd
package com.nbd.cw1.zad3

import scala.annotation.tailrec

//Stwórz funkcję korzystającą z rekurencji ogonowej do zwrócenia oddzielonego przecinkami stringa zawierającego elementy listy z ćwiczenia 1
object Zad3 {
  private val weekDays: List[String] = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")

  def getCommaSeparatedStringRecursive(weekdays: List[String]): String = {
    @tailrec
    def inner(list: List[String], acc: String): String = {
      if (list.isEmpty) acc.dropRight(1)
      else inner(list.tail, acc + list.head + ",")
    }
    inner(weekdays, "")
  }

  def main(args: Array[String]): Unit = {
    println(getCommaSeparatedStringRecursive(weekDays))
  }
}
