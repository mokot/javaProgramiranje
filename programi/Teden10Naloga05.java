import java.util.Scanner;

public class Teden10Naloga05 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int stevilo;

        do {
            stevilo = sc.nextInt();
        } while (stevilo != 42);

        System.out.println("Cestitamo, vnesli ste stevilo 42.");

        sc.close();
    }
}