import java.util.Scanner;

public class Dodatna14Naloga04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int minVeckratnik = lcm(a, b);

        System.out.println(minVeckratnik);

        sc.close();
    }

    public static int lcm(int m, int n) {
        int minV = (m > n) ? m : n;

        while (true) {
            if ((minV % m == 0) && (minV % n == 0)) {
                break;
            }
            minV++;
        }

        return minV;
    }

}
