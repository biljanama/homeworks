package SportDomaci;

import java.util.ArrayList;

public class KosarkaskiKlub extends Klub{

    public KosarkaskiKlub(String imeKluba, String grad, ArrayList<Igrac> listaIgraca) {
        super(imeKluba, grad, listaIgraca);
    }

    //Napraviti klasu KosarkaskiKlub koja nasleđuje klasu Klub, i dodati specifičnu metodu:*
    //- sampionTima() -> vraća ime igraca koji ima više od 1000 postignutih poena.

    @Override
    public int vrednostTima() {
        int suma=0;
        for (int i = 0; i < getListaIgraca().size(); i++) {
            suma+= getListaIgraca().get(i).getBrojPostignutihPoena() * 50;
        }
        return suma;
    }

    public String sampionTima() {
        for (int i=0;i<getListaIgraca().size();i++) {
            if(getListaIgraca().get(i).getBrojPostignutihPoena()>1000) {
                return getListaIgraca().get(i).getIme();
            }
        }
        return "Nema igraca koji ima vise od 1000 postignutih poena";
    }

}
