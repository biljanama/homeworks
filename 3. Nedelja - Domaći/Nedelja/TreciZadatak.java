package PrvaNedeljaJave;

import java.util.Scanner;

public class TreciZadatak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite prvi broj: ");
        int a = sc.nextInt();
        System.out.println("Unesite znak + za sabiranje ili znak - za oduzimanje. ");
        char znak = sc.next().charAt(0);
        System.out.println("Unesite drugi broj: ");
        int b = sc.nextInt();

        if (znak == '+') {
            int zbir = a + b;
            System.out.println("Zbir brojeva " + a + " i " + b + " je: " + zbir);
        } else if (znak == '-') {
            int razlika = a - b;
            System.out.println("Razlika brojeva " + a + " i " + b + " je: " + razlika);
        } else {
            System.out.println("Pogresan unos.");
        }

    }
}




/*
Napisi jednostavan kalkulator koji trazi od korisnika da unese dva broja i operaciju (+ ili -).
Na osnovu izbora korisnika, program treba da izvrsi odgovarajucu operaciju.
(char operacija = sc.next().charAt(0); -> za ucitavanje znaka)

*charAt(i) vraca karatker na i-tom mestu iz stringa,
brojanje pocinje od 0 => charAt(0) -> vraca karakter na prvoj poziciji stringa

 */