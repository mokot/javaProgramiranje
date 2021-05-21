import java.util.Scanner;

public class Dodatna09Naloga07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // f(x) = ax^2 + bx + c -> ax^2 + bx + c = 0

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int diskriminanta = b * b - 4 * a * c;

        if (diskriminanta >= 0) {
            if (diskriminanta == 0) {
                double x = ((double) (-1) * b) / (2 * a);
                System.out.printf("x1 = %.2f\nx2 = %.2f\n", x, x);
            } else {
                double d = (double) Math.sqrt(diskriminanta);

                double x1 = ((-1) * b + d) / (2 * a);
                double x2 = ((-1) * b - d) / (2 * a);
                System.out.printf("x1 = %.2f\nx2 = %.2f\n", x1, x2);
            }
        }

        sc.close();

    }
}   