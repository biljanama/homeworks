package Cetvrtak;

import java.util.Scanner;

public class DomaciPetDrugi {
    public static void main(String[] args) {
        /*
        Napisati program koji koristi metodu za izracunavanje faktorijela unetog broja.

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Napisite broj");
        int broj = sc.nextInt();

        int rezultat = faktorijel(broj);
        System.out.println(rezultat);
    }

    public static int faktorijel(int a) {
       int mnozenje = 1;
       for (int i =1; i<=a; i++) {
           mnozenje= mnozenje*i;
        }
        return mnozenje;

    }


}
