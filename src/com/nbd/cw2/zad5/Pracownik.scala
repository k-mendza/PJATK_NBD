package com.nbd
package com.nbd.cw2.zad5

trait Pracownik extends Osoba {
  private var pensja = 0.0

  override def podatek: Double = pensja*0.2


  def getPensja(): Double = {
    this.pensja
  }

  def setPensja(nowaPensja: Double): Unit = {
    this.pensja = nowaPensja
  }
}
