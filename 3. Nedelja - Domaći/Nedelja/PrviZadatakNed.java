package PrvaNedeljaJave;

import java.util.Scanner;

public class PrviZadatakNed {

    public static void main(String[] args) {
        Scanner skener = new Scanner(System.in);
        System.out.println("Unesite poluprecnik kruga: ");
        double poluprecnik = skener.nextInt();
        double obim = 2 * poluprecnik * Math.PI;
        double povrsina = Math.pow(poluprecnik, 2) * Math.PI;
        System.out.println("Obim kruga je: " + obim);
        System.out.println("Povrsina kruga je: " + povrsina);

    }



}
