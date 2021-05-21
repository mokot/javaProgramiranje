import java.util.Scanner;

public class Teden10Naloga04 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int vsota = 0;

        for (int i = 0; i < 5; i++) {
            int stevilo = sc.nextInt();
            vsota += stevilo;
            System.out.println("Vsota " + vsota);
        }

        sc.close();
    }
}