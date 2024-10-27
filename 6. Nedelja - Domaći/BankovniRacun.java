package Banka;

public class BankovniRacun {
    //Implementirati provere da li je iznos uplate ili skidanja pozitivan i da li postoji dovoljno
    //sredstava na racunu za skidanje.
    //

    int brojRacuna;
    String imeKlijenta;
    double stanjeNaRacunu;

    public BankovniRacun (int brojRacuna, String imeKlijenta, double stanjeNaRacunu) {
        this.brojRacuna=brojRacuna;
        this.imeKlijenta=imeKlijenta;
        this.stanjeNaRacunu=stanjeNaRacunu;
    }

    public void uplata (double iznos) {
        if (iznos>0) {
            stanjeNaRacunu = stanjeNaRacunu + iznos;
        }
    }

    public void isplata (double iznos) {
        if (iznos > 0 && iznos < stanjeNaRacunu) {
            stanjeNaRacunu = stanjeNaRacunu-iznos;
        }
    }

    public String toString() {
        return brojRacuna + " " + imeKlijenta + " " + stanjeNaRacunu;
    }



}
