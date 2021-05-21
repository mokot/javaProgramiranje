import java.util.Scanner;

public class Vaje03Naloga01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a;
        a = vsotaDeliteljev(n);

        int b;
        b = vsotaDeliteljev(a);

        if (b == n) {
            System.out.println("DA " + a);
        } else {
            System.out.println("NE");
        }

        sc.close();
    }

    // Metoda, ki izracuna vsoto pravih deliteljev stevila x
    public static int vsotaDeliteljev(int x) {
        int vsota = 0;
        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                vsota = vsota + i;
            }
        }

        return vsota;
    }
}