package com.nbd
package com.nbd.cw2.zad3

//Zdefiniuj klasę Osoba z własnościami imie i nazwisko. Stwórz kilka instancji tej klasy. Zdefiniuj funkcję, która
//przyjmuje obiekt klasy osoba i przy pomocy Pattern Matching wybiera i zwraca napis zawierający przywitanie danej osoby.
//Zdefiniuj 2-3 różne przywitania dla konkretnych osób (z określonym imionami lub nazwiskami) oraz jedno domyślne.
object Zad3 {
  def main(args: Array[String]): Unit = {
    val kasia = Osoba("Kasia", "Kowalska")
    val arek = Osoba("Arek", "Bronowski")
    val zygmunt = Osoba("Zygmunt", "Torpeda")
    val bezimienny = Osoba("Imię", "Nazwisko")

    println(greet(kasia))
    println(greet(arek))
    println(greet(zygmunt))
    println(greet(bezimienny))
  }

  def greet(p: Osoba): String = {
    p match {
      case Osoba("Kasia", _) => "Witaj Kasia"
      case Osoba("Arek", _) => "Cześć Arek"
      case Osoba("Zygmunt", _) => "Siemanko Zygi"
      case Osoba(i, n) => s"Dzień dobry $i $n"
    }
  }
}
