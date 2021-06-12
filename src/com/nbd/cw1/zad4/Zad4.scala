package com.nbd
package com.nbd.cw1.zad4

//Dla listy z ćwiczenia 1 napisz funkcję tworzącą w oparciu o nią stringa z elementami oddzielonymi przecinkami korzystając z:
//  a. Metody foldl
//  b. Metody foldr
//  c. Metody foldl wypisując tylko dni z nazwami zaczynającymi się na „P”
object Zad4 {
  private val weekDays: List[String] = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")

  //a
  def getCommaSeparatedStringFoldl(): String = {
    weekDays.foldLeft("")(_+","+_).drop(1)
  }

  //b
  def getCommaSeparatedStringFoldr(): String = {
    weekDays.foldRight("")(_+","+_).dropRight(1)
  }

  //c
  def getFilteredCommaSeparatedStringFoldl(prefixPhrase: String): String = {
    weekDays
      .filter( wd => wd.startsWith(prefixPhrase))
      .foldLeft("")(_+","+_).drop(1)
  }

  def main(args: Array[String]): Unit = {
    println(getCommaSeparatedStringFoldl())
    println(getCommaSeparatedStringFoldr())
    println(getFilteredCommaSeparatedStringFoldl("P"))
  }
}
