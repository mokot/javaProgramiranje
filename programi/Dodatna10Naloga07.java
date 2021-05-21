import java.util.Scanner;

public class Dodatna10Naloga07 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int stevilo = n * i;
            // n=5,i=3 -> 5 * 3 = 15
            System.out.printf("%d * %2d = %3d\n", n, i, stevilo);
        }

        sc.close();
    }
}