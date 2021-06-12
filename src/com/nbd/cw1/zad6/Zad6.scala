package com.nbd
package com.nbd.cw1.zad6

//Zdefiniuj funkcję przyjmującą krotkę z 3 wartościami różnych typów i wypisującą je
object Zad6 {

  def tupleFunc(tuple: (String, Int, Double)): String = {
    tuple._1.concat(",").concat(tuple._2.toString).concat(",").concat(tuple._3.toString)
  }

  def main(args: Array[String]): Unit = {
    println(tupleFunc("String", 1, 2.0))
  }
}
