package PrvaNedeljaJave;

import java.util.Arrays;
import java.util.Scanner;

public class DrugiZadatak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj bodova: ");
        int brojBodova = sc.nextInt();
        if (brojBodova < 51) {
            System.out.println("Broj bodova nije dovoljan za polaganje ispita.");
        } else if (brojBodova <= 60) {
            System.out.println("Tvoja ocena je 6.");
        } else if (brojBodova <= 70) {
            System.out.println("Tvoja ocena je 7.");
        } else if (brojBodova <= 80) {
            System.out.println("Tvoja ocena je 8.");
        } else if (brojBodova <= 90) {
            System.out.println("Tvoja ocena je 9.");
        } else if (brojBodova <= 100) {
            System.out.println("Tvoja ocena je 10.");
        } else {
            System.out.println("Neispravan unos.");
        }
    }
}
