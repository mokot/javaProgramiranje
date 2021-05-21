import java.util.Scanner;

public class Dodatna16Naloga03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sredina = n / 2 + 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n; j++) {
                if (i == sredina || j == sredina) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}