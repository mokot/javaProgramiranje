import java.util.Scanner;

public class Dodatna08Naloga04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double vsota, razlika, produkt, kolicnik;
        
        vsota = a + b;
        razlika = a - b;
        produkt = a * b;
        kolicnik = a / b;

        System.out.printf("%.2f %.2f %.2f %.2f\n", vsota, razlika, produkt, kolicnik);

        sc.close();
    }
}