package SportDomaci;

public class Igrac {

    //Napraviti klasu Igrac koja ima atribute: ime, godine iskustva, i broj postignutih poena.*
    //Napraviti klasu Klub koja ima atribute: naziv, grad, i lista igraca (lista objekata klase Igrac).
    //Napraviti metode:
    //- najiskusnijiIgrac() -> vraca ime igrača sa najvise godina iskustva.
    //- ukupnoPoena() -> vraća ukupan broj poena koje su postigli svi igrači u klubu.
    //- vrednostTima() -> vraca vrednost tima (apstraktan metod)

    //Napraviti klasu KosarkaskiKlub koja nasleđuje klasu Klub, i dodati specifičnu metodu:*
    //- sampionTima() -> vraća ime igraca koji ima više od 1000 postignutih poena.

    //Napraviti klasu FudbalskiKlub koja nasleđuje klasu Klub, i dodati metodu:
    //- najboljiStrelac() -> vraca ime igraca sa najvise postignutih golova (golove cemo interpretirati kao postignute poene).

    //Napraviti klasu OdbojkaškiKlub koja nasleđuje klasu Klub, i dodati metodu:
    //- odbrambeniAs() -> vraća ime igrača koji ima najvise poena, ali je igrao manje od 3 godine.

    //vrednostTima() -> za kosarkaski tim racunamo da igrac vredi 50 za svaki postignut poen,
    // za fudbalski tim racunamo da igrac vredi po 1000 za svaki postignut gol,
    // dok za odbojkaski tim svaki igrac vredi 100 po poenu. Vrednost tima predstavlja sumu cena svih njegovih igraca


    private String ime;
    private int godineIskustva;
    private int brojPostignutihPoena;


    public Igrac(String ime, int godineIskustva, int brojPostignutihPoena) {
        this.ime = ime;
        this.godineIskustva = godineIskustva;
        this.brojPostignutihPoena = brojPostignutihPoena;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }

    public int getBrojPostignutihPoena() {
        return brojPostignutihPoena;
    }

    public void setBrojPostignutihPoena(int brojPostignutihPoena) {
        this.brojPostignutihPoena = brojPostignutihPoena;
    }

    public String toString() {
        return ime + " " + brojPostignutihPoena + godineIskustva;
    }
}
