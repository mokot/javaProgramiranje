import java.util.Scanner;

public class Dodatna13Naloga04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int d = sc.nextInt();

        int steviloKombinacij = 0;

        for (int a = 1; a <= 9; a += 2) {
            for (int b = m + 1; b <= 9; b++) {
                for (int c = 0; c <= 9; c += d) {
                    System.out.printf("%d-%d-%d\n", a, b, c);
                    steviloKombinacij++;
                }
            }
        }

        System.out.println(steviloKombinacij);

        sc.close();
    }
}