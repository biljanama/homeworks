package Cetvrtak;

import java.util.Scanner;

public class DomaciCetPrviZad {
    public static void main(String[] args) {
        /*
        Napisati program koji trazi od korisnika da unese niz celih brojeva i vraca sumu svih elemenata niza
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite 5 brojeva");
        int [] niz = new int [5];
        int suma =0;

        for (int i=0; i< niz.length; i++) {
            niz[i] = sc.nextInt();
        }

        for (int i =0; i< niz.length;i++) {
           suma = niz[i] + suma;
        }
        System.out.println(suma);

    }
}
