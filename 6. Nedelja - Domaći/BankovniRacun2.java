package Banka;

public class BankovniRacun2 {


    private int brojRacuna;
    private String imeKlijenta;
    private double stanjeNaRacunu;

    public BankovniRacun2 (int brojRacuna, String imeKlijenta, double stanjeNaRacunu) {
        this.brojRacuna=brojRacuna;
        this.imeKlijenta=imeKlijenta;
        this.stanjeNaRacunu=stanjeNaRacunu;
    }

    public int getBrojRacuna() {
        return brojRacuna;
    }

    public double getStanjeNaRacunu() {
        return stanjeNaRacunu;
    }

    public String getImeKlijenta() {
        return imeKlijenta;
    }

    public void setBrojRacuna(int brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public void setImeKlijenta(String imeKlijenta) {
        this.imeKlijenta = imeKlijenta;
    }

    public void setStanjeNaRacunu(double stanjeNaRacunu) {
        this.stanjeNaRacunu = stanjeNaRacunu;
    }

    public void uplata (double iznos) {
        if (iznos>0) {
            setStanjeNaRacunu(getStanjeNaRacunu() + iznos);
        }
    }

    public void isplata (double iznos) {
        if (iznos > 0 && iznos < getStanjeNaRacunu()) {
            setStanjeNaRacunu(getStanjeNaRacunu()-iznos);
        }
    }

    public String toString() {
        return brojRacuna + " " + imeKlijenta + " " + stanjeNaRacunu;
    }
}
