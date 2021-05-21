import java.util.Scanner;

public class Dodatna10Naloga03 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int stevilo = sc.nextInt();

        int vsota = 0;
        for (int i = 1; i <= stevilo; i++) {
            vsota += i;
        }
        System.out.println(vsota);

        sc.close();
    }
}