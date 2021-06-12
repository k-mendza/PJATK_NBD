package com.nbd
package com.nbd.cw1.zad1

//Stwórz 7 elementową listę zawierającą nazwy dni tygodnia. Napisz funkcję tworzącą w oparciu o nią stringa z elementami oddzielonymi przecinkami korzystając z:
//  a. Pętli for
//  b. Pętli for wypisując tylko dni z nazwami zaczynającymi się na „P”
//  c. Pętli while

object Zad1 {
  private val weekDays: List[String] = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")
  
  //a
  def getCommaSeparatedDaysFor(): String = {
    var accumulator = ""
    for (s <- weekDays) accumulator = accumulator.concat(s).concat(",")
    accumulator.dropRight(1)
  }

  //b
  def getCommaSeparatedDaysStartingWithLetter(letter: String): String = {
    var accumulator = ""
    for (s <- weekDays) if (s.startsWith(letter)) accumulator = accumulator.concat(s).concat(",")
    accumulator.dropRight(1)
  }

  //c
  def getCommaSeparatedDaysWhile(): String = {
    var accumulator = ""
    val iterator = weekDays.iterator
    while (iterator.hasNext) accumulator = accumulator.concat(iterator.next()).concat(",")
    accumulator.dropRight(1)
  }

  def main(args: Array[String]): Unit = {
    println(getCommaSeparatedDaysFor())
    println(getCommaSeparatedDaysStartingWithLetter("P"))
    println(getCommaSeparatedDaysWhile())
  }
}
