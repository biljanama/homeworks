package Knjizara;

import java.util.ArrayList;

public class Pesnik extends Pisac {
    public Pesnik(String ime, int godinaRodjenja, ArrayList<Knjiga> listaKnjiga) {
        super(ime, godinaRodjenja, listaKnjiga);
    }

    Knjiga k;
    //.Napraviti klasu Pesnik koji nasledjuje klasu Pisac i ima metodu:
    //brojZbirki() -> koja vraća broj knjiga koje imaju manje od 100 strana (pretpostavljamo da su zbirke poezije kraće).

    public int brojZbirki() {
        int rezultat=0;
        for(int i=0; i< getListaKnjiga().size();i++) {
            if (k.getBrojStrana() < 100) {
                rezultat++;
            }
        }
        return rezultat;
    }


}
