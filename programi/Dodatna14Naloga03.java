import java.util.Scanner;

public class Dodatna14Naloga03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int najDelitelj = gcd(a, b);

        System.out.println(najDelitelj);

        sc.close();
    }

    public static int gcd(int x, int y) {
        int najD = 1;

        for (int i = 1; i <= x && i <= y; i++) {
            if ((x % i == 0) && (y % i == 0)) {
                najD = i;
            }
        }

        return najD;
    }

}
