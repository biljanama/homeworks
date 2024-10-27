package Menjacnica;

public class Evro extends Valuta{
    public Evro(double kurs) {
        super("Euro", "EUR", kurs);
    }

    ///Euro:
    //    //Nasledjuje klasu Valuta.
    //    //Konstruktor: Postavlja vrednosti za naziv "Euro", simbol "EUR", i trenutni kurs prema dinarima.
    //    //Dodatna Metoda: postaviKursNovi(kurs: number), koja postavlja novi kurs evra.

    public void postaviKursNovi(double kurs) {
        setKurs(kurs);
    }
}
