package SportDomaci;

import java.util.ArrayList;

public abstract class Klub {

    ////Napraviti klasu Klub koja ima atribute: naziv, grad, i lista igraca (lista objekata klase Igrac).
    //    //Napraviti metode:
    //    //- najiskusnijiIgrac() -> vraca ime igrača sa najvise godina iskustva.
    //    //- ukupnoPoena() -> vraća ukupan broj poena koje su postigli svi igrači u klubu.
    //    //- vrednostTima() -> vraca vrednost tima (apstraktan metod)

    private String imeKluba;
    private String grad;
    private ArrayList<Igrac> listaIgraca;


    public Klub(String imeKluba, String grad, ArrayList<Igrac> listaIgraca) {
        this.imeKluba = imeKluba;
        this.grad = grad;
        this.listaIgraca = listaIgraca;
    }


    public String getImeKluba() {
        return imeKluba;
    }

    public void setImeKluba(String imeKluba) {
        this.imeKluba = imeKluba;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public ArrayList<Igrac> getListaIgraca() {
        return listaIgraca;
    }

    public void setListaIgraca(ArrayList<Igrac> listaIgraca) {
        this.listaIgraca = listaIgraca;
    }

    public String toString() {
        return imeKluba + " " + grad + listaIgraca;
    }

    public String najiskusnijiIgrac() {
        Igrac najiskusniji = listaIgraca.get(0);
        for(int i=0; i<listaIgraca.size();i++) {
            if(listaIgraca.get(i).getGodineIskustva()>najiskusniji.getGodineIskustva()) {
                najiskusniji=listaIgraca.get(i);
            }
        }
        return najiskusniji.getIme();
    }

    public int ukupnoPoena() {
        int rezultat=0;
        for(int i=0;i<listaIgraca.size();i++) {
            rezultat+=listaIgraca.get(i).getBrojPostignutihPoena();
        }
        return rezultat;
    }

    public abstract int vrednostTima();

}
