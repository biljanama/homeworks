package Cetvrtak;

import java.util.Scanner;

public class DomaciPetPrvi {
    public static void main(String[] args) {
        /*
        3. Napisati program koji koristi metode za ispisivanje kvadrata i korena unetog broja.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Napisite broj");
        double broj = sc.nextDouble();
        kvadrat(broj);
        koren(broj);
    }

    public static void kvadrat(double a) {
        System.out.println(Math.pow(a,2));
    }

    public static void koren(double a) {
        System.out.println(Math.sqrt(a));

    }
}
