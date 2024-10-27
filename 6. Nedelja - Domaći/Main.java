package Banka;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // U main metodi, kreirati objekat klase BankovniRacun, ispisati informacije o računu pomocu
        //metode toString, izvrsiti nekoliko uplata i skidanja novca na računu pomoću metoda uplata i
        //skidanje, te na kraju ispisati azurirane informacije o racunu.

        BankovniRacun racun = new BankovniRacun(123, "Jelena",1000 );
        System.out.println(racun);
        racun.uplata(100);
        racun.uplata(200);
        racun.isplata(100);
        racun.uplata(300);
        racun.isplata(700);
        System.out.println(racun);
        racun.isplata(5000);
        racun.isplata(-100);
        racun.uplata(-200);
        System.out.println(racun);







    }
}
