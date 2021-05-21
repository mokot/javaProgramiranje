import java.util.Scanner;

public class Dodatna10Naloga06 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int stStevk = 0;

        while (n > 0) {
            // int stevka = n % 10;
            // reverse = reverse * 10 + stevka
            n /= 10;
            stStevk++;
        }

        System.out.println(stStevk);

        sc.close();
    }
}