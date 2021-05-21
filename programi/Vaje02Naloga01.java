import java.util.Scanner;

public class Vaje02Naloga01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //10

        for (int i = 2; i <= n; i++) {
            // 7
            int stevec = 0;
            // 1 - 7
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    stevec++;
                }
            }

            if (stevec == 2) {
                System.out.println(i);
            }

        }

        sc.close();
    }
}