import java.util.Scanner;

public class naloga03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();

        int stevilo = 0;
        int skatla = 0;

        while (stevilo < k) {
            stevilo += a;
            a += b;
            skatla++;
        }

        System.out.println(skatla);
    }
}
