import java.util.Scanner;

public class NaseMetode {

    // Metoda, ki nam posice max dveh stevil in max tudi izpise
    public static void najvecje(int x, int y) {
        int max;

        if (x >= y) {
            max = x;
        } else {
            max = y;
        }

        System.out.println("max: " + max);
        return;
    }

    // Metoda, ki nam poisce min dveh stevil in min tudi izpise
    public static void najmnajse(int n, int m) {
        int min;

        if (n <= m) {
            min = n;
        } else {
            min = m;
        }

        System.out.println("min: " + min);
        return;
    }

    // Metoda, ki nam izracuna potenco stevila c na d (c^d)
    public static void potenca(int c, int d) {
        int stevilo = 1;

        for (int i = 0; i < d; i++) {
            stevilo = stevilo * c;
        }

        System.out.println("pow: " + stevilo);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        najvecje(a, b);
        najmnajse(a, b);
        potenca(a, b);

        sc.close();
    }
}