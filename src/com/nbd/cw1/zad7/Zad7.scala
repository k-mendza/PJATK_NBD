package com.nbd
package com.nbd.cw1.zad7

//Zaprezentuj działanie Option na dowolnym przykładzie (np. mapy, w której wyszukujemy wartości po kluczu)
object Zad7 {
  private val productMap = Map("CPU" -> 848.0, "GPU" -> 2849.0, "RAM" -> 699.0)

  def getValue(key: String): Double = {
    productMap.getOrElse(key, -1.0)
  }

  def main(args: Array[String]): Unit = {
    println(getValue("CPU"))
    println(getValue("APU"))
  }
}
