import java.util.Scanner;

public class Vaje04Naloga02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] t = new double[n];
        for (int i = 0; i < t.length; i++) {
            t[i] = sc.nextDouble();
        }

        double vsota = 0;
        for (int i = 0; i < t.length; i++) {
            vsota = vsota + t[i];
        }

        double povprecje = vsota / n;
        System.out.println(povprecje);

        sc.close();
    }
}
