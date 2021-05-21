import java.util.Scanner;

public class Teden10Naloga03 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int vsota = 0;

        do {
            int stevilo = sc.nextInt();
            // vsota = vsota + stevilo;
            vsota += stevilo;
            System.out.println("Vsota " + vsota);
        } while (vsota < 42);





        vsota = 0;
        System.out.println();
        int stevilo1 = sc.nextInt();
        vsota += stevilo1;
        System.out.println("Vsota " + vsota);

        while (vsota < 42) {
            int stevilo2 = sc.nextInt();
            vsota += stevilo2;
            System.out.println("Vsota " + vsota);
        }

        sc.close();
    }
}