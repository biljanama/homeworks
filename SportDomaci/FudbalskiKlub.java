package SportDomaci;

import java.util.ArrayList;

public class FudbalskiKlub extends Klub {
    public FudbalskiKlub(String imeKluba, String grad, ArrayList<Igrac> listaIgraca) {
        super(imeKluba, grad, listaIgraca);
    }

    @Override
    public int vrednostTima() {
        int suma=0;
        for (int i = 0; i < getListaIgraca().size(); i++) {
            suma+= getListaIgraca().get(i).getBrojPostignutihPoena() * 1000;
        }
        return suma;
    }

    //Napraviti klasu FudbalskiKlub koja nasleđuje klasu Klub, i dodati metodu:
    //- najboljiStrelac() -> vraca ime igraca sa najvise postignutih golova (golove cemo interpretirati kao postignute poene).

    //vrednostTima() -> za kosarkaski tim racunamo da igrac vredi 50 za svaki postignut poen,
    // za fudbalski tim racunamo da igrac vredi po 1000 za svaki postignut gol,
    // dok za odbojkaski tim svaki igrac vredi 100 po poenu. Vrednost tima predstavlja sumu cena svih njegovih igraca


    public String najboljiStrelac() {
        Igrac imaMaxGolova = getListaIgraca().get(0);
        for(int i=0; i<getListaIgraca().size();i++) {
            if(getListaIgraca().get(i).getBrojPostignutihPoena()>imaMaxGolova.getBrojPostignutihPoena()) {
                imaMaxGolova=getListaIgraca().get(i);

            }
        }
        return imaMaxGolova.getIme();

    }
}
