import java.util.Scanner;

public class Vaje02Naloga03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {

            for (int j = i + 1; j <= n; j++) {
                System.out.printf("%2d:%-2d ", i, j);
            }
            System.out.println();
        }

        sc.close();
    }
}