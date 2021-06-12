package com.nbd
package com.nbd.cw2.zad1

//Wykorzystaj Pattern Matching w funkcji przyjmującej parametr typu String. Dla stringów odpowiadających nazwom
//dni tygodnia funkcja ma zwrócić „Praca” i „Weekend” (odpowiednio dla dni roboczych i wolnych),
//dla pozostałych napisów „Nie ma takiego dnia”.
object Zad1 {
  private final val WORK = "Praca"
  private final val WEEKEND = "Weekend"
  private final val DEFAULT = "Nie ma takiego dnia"

  def matchDay(day: String): String = {
    day match {
      case "Poniedziałek" => WORK
      case "Wtorek" => WORK
      case "Środa" => WORK
      case "Czwartek" => WORK
      case "Piątek" => WORK
      case "Sobota" => WEEKEND
      case "Niedziela" => WEEKEND
      case _ => DEFAULT
    }
  }

  def main(args: Array[String]): Unit = {
    println(matchDay("Poniedziałek"))
    println(matchDay("Piątek"))
    println(matchDay("Sobota"))
    println(matchDay("Niedziela"))
  }
}
