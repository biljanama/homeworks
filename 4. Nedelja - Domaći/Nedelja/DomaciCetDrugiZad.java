package Cetvrtak;


import java.util.Scanner;

public class DomaciCetDrugiZad {
    public static void main(String[] args) {
        /*
        Napisati program koji trazi od korisnika da unese niz celih brojeva i vraca maksimalni element u nizu
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Napisite koliko brojeva zelite da unesete");
        int broj = sc.nextInt();
        System.out.println("Napisite " + broj + " celih brojeva");

        int[] niz = new int[broj];

        for (int i=0; i< niz.length; i++) {
            niz[i] = sc.nextInt();
        }

        int najveci =0;
        for (int i=0; i<niz.length;i++) {
            if (niz[i] > najveci) {
                najveci = niz[i];
            }
        }
        System.out.println(najveci);

    }
}
