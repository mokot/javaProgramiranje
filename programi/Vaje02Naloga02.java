import java.util.Scanner;

public class Vaje02Naloga02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                // %xd -> ____ x = 4
                int stevilo = i * j;
                System.out.printf("%4d ", stevilo);
            }
            System.out.println();
        }

        sc.close();
    }
}