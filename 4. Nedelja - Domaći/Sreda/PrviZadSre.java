package Domaci;

import java.util.Scanner;

public class PrviZadSre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lozinka = "mojeIme";
        String text = "";

        do {
            System.out.println("Unesite lozinku:");
            text = sc.nextLine();
        }
        while (!text.equals(lozinka));
    }
}
