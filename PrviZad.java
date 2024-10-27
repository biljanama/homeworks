package DomaciSreda;

import java.util.Scanner;

public class PrviZad {
    public static void main(String[] args) {

        //Napisati program koji omogucava korisniku da unese niz celih brojeva. Program treba da ima sledeće metode:
        //Metoda za unos niza
        //Metoda za stampanje niza
        //Metoda za racunanje srednje vredsnoti brojeva u nizu
        //Metoda za sabiranje svih dvocifrenih brojeva
        //Metoda za vracanje razlike izmedju minimalnog i maksimalnog elementa niza

        int[] nizNeki = unosNiza(5);
        stampanje(nizNeki);
        int prosek = srednjaVrednost(nizNeki);
        System.out.println("Prosek je " + prosek);
        int zbirDva= sabiranjeDvocifrenihBrojeva(nizNeki);



    }

    public static int[] unosNiza (int brojElemenata) {
        Scanner sc = new Scanner(System.in);
        int[] niz = new int[brojElemenata];
        System.out.println("Unesite " + brojElemenata + " brojeva.");

        for (int i=0; i<niz.length;i++) {
            niz[i]= sc.nextInt();
        }
        return niz;

    }

    public static void stampanje(int[] niz) {
        for (int i=0; i<niz.length;i++) {
            System.out.println(niz[i]);
        }

    }

    public static int srednjaVrednost (int[] niz) {
        int suma=0;

        for (int i=0; i<niz.length; i++) {
            suma=suma+niz[i];
        }
        int rezultat = suma/ niz.length;
        return rezultat;
    }

    public static int sabiranjeDvocifrenihBrojeva (int[] niz) {
        int sabrano=0;

        for (int i=0; i<niz.length;i++) {
            if (niz[i] >=10 && niz[i]<=99) {
                sabrano=sabrano+niz[i];
            }
        }
        return sabrano;
    }

    public static int razlikaMinMax(int[] niz) {

        int najveci = Integer.MIN_VALUE;
        int najmanji= Integer.MAX_VALUE;

        for (int i=0; i<niz.length; i++) {
            if (niz[i] > najveci) {
                najveci=niz[i];
            }
            if (niz[i] < najmanji) {
                najmanji=niz[i];
            }
        }
        int razlika = najveci-najmanji;
        return razlika;
    }


}
