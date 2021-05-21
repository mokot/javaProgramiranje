import java.util.Scanner;

/**
    1: 30.877s
    2: 9.240s
    3: 4.964s
    4: 2.503s
 */

public class Teden14Naloga02 {
    public static void main(String[] bacekJon) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n >= 2) {
            System.out.println(2);
        }

        for (int stevilo = 3; stevilo <= n; stevilo += 2) {
            if (jePrastevilo(stevilo)) {
                System.out.println(stevilo);
            }
        }

        sc.close();
    }

    public static boolean jePrastevilo(int st) {
        int meja = (int) Math.sqrt(st);
        for (int i = 3; i <= meja; i += 2) {
            if (st % i == 0) {
                return false;
            }
        }

        return true;
    }

}