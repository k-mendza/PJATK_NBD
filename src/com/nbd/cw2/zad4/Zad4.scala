package com.nbd
package com.nbd.cw2.zad4

//Zdefiniuj funkcję przyjmującą dwa parametry - wartość całkowitą i funkcję operującą na wartości całkowitej.
//Zastosuj przekazaną jako parametr funkcję trzykrotnie do wartości całkowitej i zwróć wynik.
object Zad4 {

  def multiply(base: Int): Int = {
    base * base
  }

  def performOperation(base: Int, fx: Int => Int): Int = {
    fx(fx(fx(base)))
  }

  def main(args: Array[String]): Unit = {
    println(performOperation(2, multiply))
  }
}
