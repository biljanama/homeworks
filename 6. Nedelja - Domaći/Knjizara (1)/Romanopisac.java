package Knjizara;

import java.util.ArrayList;

public class Romanopisac extends Pisac {
    public Romanopisac(String ime, int godinaRodjenja, ArrayList<Knjiga> listaKnjiga) {
        super(ime, godinaRodjenja, listaKnjiga);
    }
    Knjiga k;


    //Napraviti klasu Romanopisac koji nasledjuje klasu Pisac i specifična metoda je:
    //dugometrazniRoman() -> vraća "dugometražni roman" ako knjiga ima više od 500 strana

    public void dugometrazniRoman() {
        for(int i=0; i< getListaKnjiga().size();i++) {
            if(k.getBrojStrana()>500) {
                System.out.println(k.getNaslov() + "Ovo je dugomatrazni roman");
            }
        }
    }


}
