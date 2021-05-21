import java.util.Scanner;

public class Vaje04Naloga03 {
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

        double odklon = 0;
        for (int i = 0; i < t.length; i++) {
            double razlika = t[i] - povprecje;
            odklon = odklon + razlika * razlika;
        }

        double stddeviacija = Math.sqrt(odklon / n);
        System.out.println(stddeviacija);

        sc.close();
    }
}
