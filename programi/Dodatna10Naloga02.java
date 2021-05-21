import java.util.Scanner;
import java.util.Random;

public class Dodatna10Naloga02 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int meja = sc.nextInt(); // 10
        int izbrano = rd.nextInt(meja) + 1; // 0 - 9 -> 1 - 10

        /**
            10
            5 -> 1 - 4 6 - 10
            2/3 8 -> 
            log2(10)
         */

        int poskus = sc.nextInt();
        while (poskus != izbrano) {
            if (poskus > izbrano) {
                System.out.println("Izbrano stevilo je manjse.");
            } else {
                System.out.println("Izbrano stevilo je vecje.");
            }
            poskus = sc.nextInt();
        }
        System.out.println("Cestitam, vnesli ste pravilno stevilo in sicer stevilo " + izbrano);

        sc.close();
    }
}