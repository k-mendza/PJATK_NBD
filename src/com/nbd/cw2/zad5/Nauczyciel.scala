package com.nbd
package com.nbd.cw2.zad5

trait Nauczyciel extends Pracownik {

  override def podatek: Double = getPensja()*0.1

}
