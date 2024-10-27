package Knjizara;

import java.util.ArrayList;

public class Pisac {
    //Napraviti klasu Pisac koja ima atribute: ime, godina rođenja, i lista knjiga (lista objekata klase Knjiga).
    //Napraviti metode:
    //najpoznatijaKnjiga() -> koja vraća naslov knjige sa najvećim brojem strana.
    //vremePisanja() -> koja vraća razliku između godine izdavanja prve i poslednje knjige

    private String ime;
    private int godinaRodjenja;
    private ArrayList<Knjiga> listaKnjiga;


    public Pisac(String ime, int godinaRodjenja, ArrayList<Knjiga> listaKnjiga) {
        this.ime = ime;
        this.godinaRodjenja = godinaRodjenja;
        this.listaKnjiga = listaKnjiga;
    }


    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }

    public ArrayList<Knjiga> getListaKnjiga() {
        return listaKnjiga;
    }

    public void setListaKnjiga(ArrayList<Knjiga> listaKnjiga)

    {
        this.listaKnjiga = listaKnjiga;
    }

    public String najpoznatijaKnjiga(){
        Knjiga knjigaSaNajvecimBrStrana=listaKnjiga.get(0);
        for(int i=1; i<listaKnjiga.size();i++) {
            if (listaKnjiga.get(i).getBrojStrana() > knjigaSaNajvecimBrStrana.getBrojStrana()) {
                knjigaSaNajvecimBrStrana = listaKnjiga.get(i);
            }
        }
        return knjigaSaNajvecimBrStrana.getNaslov();
    }

    public int pronadjiPrvoIzdanje() {
        Knjiga prvoIzdanje = listaKnjiga.get(0);
        for (int i = 1; i < listaKnjiga.size(); i++) {
            if (listaKnjiga.get(i).getGodinaIzdavanja() < prvoIzdanje.getGodinaIzdavanja()) {
                prvoIzdanje = listaKnjiga.get(i);
            }
        }
        return prvoIzdanje.getGodinaIzdavanja();
    }

    public int pronadjiPoslednjeIzdanje() {
        Knjiga poslednjeIzdanje = listaKnjiga.get(0);
        for (int i = 1; i < listaKnjiga.size(); i++) {
            if (listaKnjiga.get(i).getGodinaIzdavanja() > poslednjeIzdanje.getGodinaIzdavanja()) {
                poslednjeIzdanje = listaKnjiga.get(i);
            }
        }
        return poslednjeIzdanje.getGodinaIzdavanja();
    }

    public int vremePisanja() {
        return pronadjiPoslednjeIzdanje()-pronadjiPrvoIzdanje();
    }

}
