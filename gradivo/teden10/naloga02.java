import java.util.Scanner;
import java.util.Random;

public class naloga02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();   

        int meja = sc.nextInt();
        int izbrano = random.nextInt(meja) + 1;

        int poskus = sc.nextInt();
        while (poskus != izbrano) {
            if (poskus > izbrano) {
                System.out.println("Izbrano stevilo je manjse.");
            } else {
                System.out.println("Izbrano stevilo je vecje");
            }
            poskus = sc.nextInt();
        }
    }
}
