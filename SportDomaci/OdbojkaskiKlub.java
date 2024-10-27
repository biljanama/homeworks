package SportDomaci;

import java.util.ArrayList;

public class OdbojkaskiKlub extends Klub {
    public OdbojkaskiKlub(String imeKluba, String grad, ArrayList<Igrac> listaIgraca) {
        super(imeKluba, grad, listaIgraca);
    }

    @Override
    public int vrednostTima() {
        int suma=0;
        for (int i = 0; i < getListaIgraca().size(); i++) {
            suma+= getListaIgraca().get(i).getBrojPostignutihPoena() * 100;
        }
        return suma;
    }
    //Napraviti klasu OdbojkaškiKlub koja nasleđuje klasu Klub, i dodati metodu:
    //    //- odbrambeniAs() -> vraća ime igrača koji ima najvise poena, ali je igrao manje od 3 godine.
    //    //vrednostTima() ->za odbojkaski tim svaki igrac vredi 100 po poenu. Vrednost tima predstavlja sumu cena svih njegovih igraca



    public String odbrambeniAs() {
        ArrayList<Igrac> manjeOd3God= new ArrayList<>();
        for (int i=0;i<getListaIgraca().size();i++) {
            if(getListaIgraca().get(i).getGodineIskustva()<3) {
                manjeOd3God.add(getListaIgraca().get(i));
            }
        }
        if(manjeOd3God.size()==0) {
            return "Ne postoji";
        }
        Igrac imaMaxGolova = manjeOd3God.get(0);
        for(int i=0; i<manjeOd3God.size();i++) {
            if(manjeOd3God.get(i).getBrojPostignutihPoena()>imaMaxGolova.getBrojPostignutihPoena()) {
                imaMaxGolova=manjeOd3God.get(i);

            }
        }
        return imaMaxGolova.getIme();
    }

}
