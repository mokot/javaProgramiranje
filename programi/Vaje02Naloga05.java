import java.util.Scanner;

public class Vaje02Naloga05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        /**
            n = 5 (2 * i - 1) ((n - i) * 2)

        1   ________*
        2   ______*_*_*
        3   ____*_*_*_*_*
        4   __*_*_*_*_*_*_*
        5   *_*_*_*_*_*_*_*_*
         */

        for (int i = 1; i <= n; i++) {

            for (int j = (n - i) * 2; j >= 0; j--) {
                System.out.printf(" ");
            }

            for (int j = 2 * i - 1; j > 0; j--) {
                System.out.printf("* ");
            }

            System.out.println();

        }

        sc.close();
    }
}