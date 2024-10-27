public class DomaciCetBiljanaM {
    public static void main(String[] args) {
        /* 1. Napisati program koji računa površinu i obim pravougaonika sa zadatim dimenzijama a = 5 i b = 13 (dužine stranica).
           2. String s1 = "bootcamp qa" i s2 = "xx generacija" spojiti u novi string i ispisati ga u konzoli tako da sva slova budu velika.
           3. Inicijalizovati promenljive broj1 i broj2 sa proizvoljnim vrednostima, zatim ispisati rezultate njihovog zbira, proizvoda i ostatka pri deljenju.
         */

        int a = 5;
        int b = 13;
        int povrsinaP = a * b;
        int obimP = 2 * a + 2 * b;
        System.out.println( "Povrsina pravougaonika je: " + povrsinaP);
        System.out.println( "Obim pravougaonika je: " + obimP);

        String s1 = "bootcamp qa ";
        String s2 = "xx generacija";
        String s3 = s1 + s2;
        String s4 = s3.toUpperCase();
        System.out.println(s4);

        int broj1 = 6;
        int broj2 = 19;
        int zbir = broj1 + broj2;
        int proizvod = broj1 * broj2;
        int ostatak = broj1 % broj2;
        int ostatak1 = broj2 % broj1;
        System.out.println(zbir);
        System.out.println(proizvod);
        System.out.println(ostatak);
        System.out.println(ostatak1);
    }
}
