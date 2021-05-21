import java.util.Scanner;

public class Vaje04Naloga01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] t = new double[n];
        for (int i = 0; i < t.length; i++) {
            t[i] = sc.nextDouble();
        }

        double max = Integer.MIN_VALUE;
        int imax = -1;

        for (int i = 0; i < t.length; i++) {
            double st = t[i];

            if (st > max) {
                max = st;
                imax = i;
            }
        }

        System.out.printf("%.2f [%d]\n", max, imax);

        sc.close();
    }
}
