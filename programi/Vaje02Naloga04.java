import java.util.Scanner;

public class Vaje02Naloga04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        /**
            n = 5

        1   *
        2   *_*
        3   *_*_*
        4   *_*_*_*
        5   *_*_*_*_*
         */

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}