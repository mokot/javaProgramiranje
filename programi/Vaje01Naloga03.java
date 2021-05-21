import java.util.Scanner;

public class Vaje01Naloga03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        // System.out.printf("a = %d\nb = %d\n", b, a);

        /* int temp;
        temp = a;
        a = b;
        b = temp; */

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.printf("a = %d\nb = %d\n", a, b);

        sc.close();
    }
}