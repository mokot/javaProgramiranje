import java.util.Scanner;

public class Vaje03Naloga04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int stevec = 0;

        for (int stevilo = a; stevilo <= b; stevilo++) {
            if (jeArmstrongovo(stevilo)) {
                stevec++;
                System.out.println(stevilo);
            }
        }

        System.out.println(stevec);

        sc.close();
    }

    public static boolean jeArmstrongovo(int n) {
        int pomozna1 = n;
        int dolzinaSt = 0;

        while (pomozna1 > 0) {
            pomozna1 = pomozna1 / 10;
            dolzinaSt++;
        }

        int pomozna2 = n;
        int a = 0;

        while (pomozna2 > 0) {
            int stevka = pomozna2 % 10;
            pomozna2 = pomozna2 / 10;

            int x = (int) Math.pow(stevka, dolzinaSt);
            a = a + x;
        }

        if (n == a) {
            return true;
        }

        return false;
    }

}