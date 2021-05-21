import java.util.Scanner;

public class Teden14Naloga01 {
    public static void main(String[] bacekJon) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int v = vsota(a, b);
        System.out.printf("%d + %d = %d\n", a, b, v);

        System.out.printf("%d - %d = %d\n", a, b, razlika(a, b));

        System.out.printf("%d * %d = %d\n", a, b, produkt(a, b));

        System.out.printf("%d / %d = %.2f\n", a, b, kolicnik(a, b));

        System.out.printf("%d %% %d = %d\n", a, b, mod(a, b));

        sc.close();
    }

    public static int vsota(int x, int y) {
        return x + y;
    }

    public static int razlika(int x, int y) {
        int r;
        r = x - y;
        return r;
    }

    public static int produkt(int x, int y) {
        return x * y;
    }

    public static double kolicnik(int x, int y) {
        double z = (double) x;
        return z / y;
    }

    public static int mod(int x, int y) {
        return x % y;
    }
}