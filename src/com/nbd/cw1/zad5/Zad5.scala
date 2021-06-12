package com.nbd
package com.nbd.cw1.zad5

//Stwórz mapę z nazwami produktów i cenami. Na jej podstawie wygeneruj drugą, z 10% obniżką cen. Wykorzystaj mechanizm mapowania kolekcji.
object Zad5 {
  private val productMap = Map("CPU" -> 848.0, "GPU" -> 2849.0, "RAM" -> 699.0)

  def getLowerPricesMap(): Map[String, Double] = {
    productMap map {case (key, value) => (key, value * 0.9)}
  }

  def main(args: Array[String]): Unit = {
    println(getLowerPricesMap())
  }
}
