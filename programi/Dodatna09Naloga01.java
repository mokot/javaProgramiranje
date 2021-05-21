import java.util.Scanner;

public class Dodatna09Naloga01 {
    public static void main(String[] argss) {
        Scanner sc = new Scanner(System.in);

        int km = sc.nextInt();

        /**
            1km .......... 0.621371192milja
            xkm .......... x * 0.621371192milja
         */

        double milja = km * 0.621371192;
        System.out.printf("%.1f \n", milja);

    }
}