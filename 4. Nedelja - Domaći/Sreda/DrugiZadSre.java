package Domaci;

import java.util.Scanner;

public class DrugiZadSre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Unesite dva broja.");
            int brojPrvi = sc.nextInt();
            int brojDrugi = sc.nextInt();
            if (brojDrugi!=0) {
                int rezultat = brojPrvi / brojDrugi;
                System.out.println("Rezultat deljenja je: " + rezultat);
                break;
            }
        }
    }
}
