import java.util.Scanner;

public class Dodatna10Naloga05 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int crka = 65; crka <= 90; crka++) {
            char znak = (char) crka;
            System.out.print(znak + " ");
        }
        System.out.println();

        for (int crka = 97; crka <= 122; crka++) {
            char znak = (char) crka;
            System.out.print(znak + " ");
        }
        System.out.println();

        sc.close();
    }
}