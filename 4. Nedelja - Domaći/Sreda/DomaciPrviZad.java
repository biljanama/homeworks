package PrvaNedeljaJave;

import java.util.Scanner;

public class DomaciPrviZad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ocenu: ");
        int ocena = sc.nextInt();

        switch (ocena) {
            case 5:
                System.out.println("Odlican.");
                break;
            case 4:
                System.out.println("Vrlo dobar.");
                break;
            case 3:
                System.out.println("Dobar.");
                break;
            case 2:
                System.out.println("Dovoljan.");
                break;
            case 1:
                System.out.println("Nedovoljan.");
                break;
            default:
                System.out.println("Nepravilan unos. Ocene su od 1 do 5.");


        }
    }
}
