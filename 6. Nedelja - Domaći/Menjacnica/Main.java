package Menjacnica;


public class Main {
    public static void main(String[] args) {
        ////Napisati glavni program koji kreira objekte za dolar i evro, postavlja njihove kurseve,
        //    // i vrsi konverziju odredjenih iznosa iz jedne valute u drugu.

        Dolar d = new Dolar(100);
        Evro e = new Evro(50);
        e.postaviKursNovi(200);
        d.postaviKursNovi(200);
        System.out.println(d.konvertujUDinare(60));
    }
}
