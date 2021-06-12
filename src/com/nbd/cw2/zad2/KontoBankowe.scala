package com.nbd
package com.nbd.cw2.zad2

class KontoBankowe(val stanKonta: Double = 0) {

  def wplata(kwota: Double): KontoBankowe = {
    new KontoBankowe(stanKonta + kwota)
  }

  def wyplata(kwota: Double): KontoBankowe = {
    new KontoBankowe(stanKonta - kwota)
  }

}
