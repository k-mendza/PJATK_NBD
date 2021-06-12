package com.nbd
package com.nbd.cw2.zad2

//Zdefiniuj klasę KontoBankowe z metodami wplata i wyplata oraz własnością stanKonta - własność ma być tylko do odczytu.
//Klasa powinna udostępniać konstruktor przyjmujący początkowy stan konta oraz drugi, ustawiający początkowy stan konta na 0.
object Zad2 {
  def main(args: Array[String]): Unit = {
    val kontoBankowe = new KontoBankowe
    println("Stan początkowy: " + kontoBankowe.stanKonta)
    val noweKontoBankowe = kontoBankowe.wplata(100).wyplata(50)
    println("Stan końcowy: " + noweKontoBankowe.stanKonta)

    val kolejneKontoBankowe = new KontoBankowe(1000)
    println("Stan początkowy: " + kolejneKontoBankowe.stanKonta)
    val kolejneNoweKonto = kolejneKontoBankowe.wyplata(499.99)
    println("Stan końcowy: " + kolejneNoweKonto.stanKonta)
  }
}
