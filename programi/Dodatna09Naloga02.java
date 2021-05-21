import java.util.Scanner;

public class Dodatna09Naloga02 {
    public static void main(String[] argss) {
        Scanner sc = new Scanner(System.in);

        // celzij * 1.8 = fahrenheit - 32 -> f = c * 1.8 + 32
        
        double celzij = sc.nextDouble();
        double fahrenheit = (celzij * 1.8) + 32;

        System.out.printf("%.2f \n", fahrenheit);

    }
}