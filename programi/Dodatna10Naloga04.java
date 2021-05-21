import java.util.Scanner;

public class Dodatna10Naloga04 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int stevilo = sc.nextInt();

        int fakulteta = 1;
        // n! = n * (n - 1) * ... * 3 * 2 * 1
        for (int i = stevilo; i > 0; i--) {
            fakulteta = fakulteta * i;
        }
        System.out.println(fakulteta);

        sc.close();
    }
}