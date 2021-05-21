import java.util.Scanner;

public class Vaje03Naloga03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int stevec = 0;

        for (int stevilo = a; stevilo <= b; stevilo++) {
            if (jePalindrom(stevilo)) {
                stevec++;
                System.out.println(stevilo);
            }
        }

        System.out.println(stevec);

        sc.close();
    }

    public static boolean jePalindrom(int n) {
        int pomozna = n;
        int p = 0;
        while (pomozna > 0) {
            int stevka = pomozna % 10;
            pomozna = pomozna / 10;

            p = p * 10 + stevka;
        }

        if (n == p) {
            return true;
        }

        return false;
    }
}