import java.util.Scanner;

public class Vhod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        System.out.printf("Prosim, vnesite stevilo: ");
        int stevilo = sc.nextInt();
        System.out.printf("Vnesli ste stevilo: %d\n", stevilo);
        */

        // KAKO BEREMO:
        int steviloInt = sc.nextInt();
        long steviloLong = sc.nextLong();
        float steviloFloat = sc.nextFloat();
        double steviloDouble = sc.nextDouble();
        boolean logicnaVrednost = sc.nextBoolean();

        char znak = sc.next().charAt(0);

        String niz1 = sc.next();
        String niz2 = sc.nextLine();

        System.out.printf("Vnesli ste celo stevilo: %d\n", steviloInt);
        System.out.printf("Vnesli ste VELIKO celo stevilo: %d\n", steviloLong);
        System.out.printf("Vnesli ste realno stevilo: %f\n", steviloFloat);
        System.out.printf("Vnesli ste VELIKO realno stevilo: %f\n", steviloDouble);
        System.out.printf("Vnesli ste logicno vrednost: %b\n", logicnaVrednost);
        System.out.printf("Vnesli ste znak: %c\n", znak);
        System.out.printf("Vnesli ste kratek niz: %s\n", niz1);
        System.out.printf("Vnesli ste dolg niz: %s\n", niz2);

        sc.close();
    }
}