import java.util.Scanner;

public class Vaje01Naloga04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int vsota, razlika, produkt, mod;
        double kolicnik;

        vsota = a + b;
        razlika = a - b;
        produkt = a * b;
        kolicnik = (double) a / b;
        mod = a % b;

        System.out.printf("%d %d %d %.2f %d\n", vsota, razlika, produkt, kolicnik, mod);

        sc.close();
    }
}