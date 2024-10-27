package Menjacnica;

public class Dolar extends Valuta{
    public Dolar(double kurs) {
        super("Dolar", "USD", kurs);
    }

    //Konstruktor: Postavlja vrednosti za naziv "Dolar", simbol "USD", i trenutni kurs prema dinarima.
    //    //Dodatna Metoda: postaviKursNovi(kurs), koja postavlja novi kurs dolara.

    public void postaviKursNovi(double kurs) {
        setKurs(kurs);
    }
}
