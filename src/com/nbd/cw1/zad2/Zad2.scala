package com.nbd
package com.nbd.cw1.zad2

//Dla listy z ćwiczenia 1 napisz funkcję tworzącą w oparciu o nią stringa z elementami oddzielonymi przecinkami korzystając z:
//  a. Funkcji rekurencyjnej
//  b. Funkcji rekurencyjnej wypisując elementy listy od końca
object Zad2 {
  private val weekDays: List[String] = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")

  //a
  def getCommaSeparatedWeekDaysASC(accumulator: String, index: Int): String = {
    if (index == weekDays.length)
      accumulator.dropRight(1)
    else {
      val day = weekDays(index)
      val currentAccumulator = accumulator.concat(day).concat(",")
      getCommaSeparatedWeekDaysASC(currentAccumulator, index + 1)
    }
  }

  //b
  def getCommaSeparatedWeekDaysDSC(accumulator: String, index: Int): String = {
    if (index < 0)
      accumulator.dropRight(1)
    else {
      val day = weekDays(index)
      val currentAccumulator = accumulator.concat(day).concat(",")
      getCommaSeparatedWeekDaysDSC(currentAccumulator, index - 1)
    }
  }

  def main(args: Array[String]): Unit = {
    println(getCommaSeparatedWeekDaysASC("", 0))
    println(getCommaSeparatedWeekDaysDSC("", weekDays.length - 1))
  }
}
