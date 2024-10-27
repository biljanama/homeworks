package Knjizara;

import java.util.ArrayList;

public class Eseista extends Pisac {
    public Eseista(String ime, int godinaRodjenja, ArrayList<Knjiga> listaKnjiga) {
        super(ime, godinaRodjenja, listaKnjiga);
    }
    Knjiga k;

    //Napraviti klasu Esesista koja nasledjuje klasu Pisac i dodati metodu:
    //kratkiEseji() -> vraća broj eseja (knjiga) koji imaju manje od 50 strana.

    public int kratkiEseji() {
        int rezultat = 0;
        for (int i = 0; i < getListaKnjiga().size(); i++) {
            if (k.getBrojStrana() < 100) {
                rezultat++;
            }
        }
        return rezultat;

    }
}
