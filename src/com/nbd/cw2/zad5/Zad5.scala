package com.nbd
package com.nbd.cw2.zad5

//Zdefiniuj klasę Osoba i trzy traity: Student, Nauczyciel, Pracownik.
//Osoba powinna mieć własności read only: imie, nazwisko, podatek.
//Pracownik powinien mieć własność pensja (z getterem i seterem).
//Student i Pracownik powinni przesłaniać własność podatek – dla Studenta zwracamy 0, dla Pracownika 20% pensji.
//Nauczyciel powinien dziedziczyć z Pracownika, dla niego podatek zwraca 10% pensji.
//Stwórz obiekty z każdym z traitów, pokaż jak podatek działa dla każdego z nich.
//Stwórz obiekty z traitami Student i Pracownik, pokaż jak podatek zadziała w zależności od kolejności w jakiej te traity zostały dodane przy tworzeniu obiektu.
object Zad5 {
  def main(args: Array[String]): Unit = {

    val osobaWithPracownik = new Osoba("Jan", "Babacki") with Pracownik
    osobaWithPracownik.setPensja(100.00)
    println("Osoba with Pracownik: " + osobaWithPracownik.podatek)

    val osobaWithStudent = new Osoba("Jan", "Cabacki") with Student
    println("Osoba with Student: " + osobaWithStudent.podatek)

    val osobaWithNauczyciel = new Osoba("Jan", "Dabacki") with Nauczyciel
    osobaWithNauczyciel.setPensja(100.00)
    println("Osoba with Nauczyciel: " + osobaWithNauczyciel.podatek)

    val osobaWithStudentAndPracownik = new Osoba("Jan", "Kowalski") with Student with Pracownik
    osobaWithStudentAndPracownik.setPensja(100.00)
    println("Osoba with Student + Pracownik: " + osobaWithStudentAndPracownik.podatek)

    val osobaWithPracownikAndStudent = new Osoba("Jan", "Abacki") with Pracownik with Student
    osobaWithPracownikAndStudent.setPensja(100.00)
    println("Osoba with Pracownik + Student: " + osobaWithPracownikAndStudent.podatek)
    println("Wniosek: Traity są analizowane od lewej do prawej")
  }
}
