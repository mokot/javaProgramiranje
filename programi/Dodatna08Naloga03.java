import java.util.Scanner;

public class Dodatna08Naloga03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int vsota = a + b;
        System.out.println(vsota);

        sc.close();
    }
}