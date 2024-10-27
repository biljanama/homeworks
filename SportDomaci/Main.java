package SportDomaci;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Igrac igrac1 = new Igrac("Luka", 3,1100);
        Igrac igrac2 = new Igrac("Stefan", 5, 900);
        Igrac igrac3= new Igrac("Aleksandar", 2, 800);

        ArrayList<Igrac> igraci = new ArrayList<>();
        igraci.add(igrac1);
        igraci.add(igrac2);
        igraci.add(igrac3);

        FudbalskiKlub fk = new FudbalskiKlub("Zvezda", "Beograd",igraci);
        KosarkaskiKlub kk = new KosarkaskiKlub("Trojka", "Novi Sad",igraci);
        OdbojkaskiKlub ok = new OdbojkaskiKlub("Cekic", "Nis",igraci);


        System.out.println("Ovo je najiskusniji igrac: " + fk.najiskusnijiIgrac());
        System.out.println("Ukupan br poena: " + ok.ukupnoPoena());
        System.out.println("Naj strelac: " + fk.najboljiStrelac());
        System.out.println("As: " + ok.odbrambeniAs());
        System.out.println("Sampion tima je: " + kk.sampionTima());
        System.out.println("Vrednost odbojkaskog tima je " + ok.vrednostTima());
        System.out.println("Vrednost kosarkaskog tima je " + kk.vrednostTima());
        System.out.println("Vrednost fudbalskog tima je " + fk.vrednostTima());







    }
}
