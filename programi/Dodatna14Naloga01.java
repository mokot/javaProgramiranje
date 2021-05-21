import java.util.Scanner;

public class Dodatna14Naloga01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean flag = false;

        // 14 = 3 + 11
        for (int stevilo = 1; stevilo <= n / 2; stevilo++) {
            if (jePrastevilo(stevilo)) {
                if (jePrastevilo(n - stevilo)) {
                    System.out.printf("%d = %d + %d\n", n, stevilo, n - stevilo);
                    flag = true;
                }
            }
        }

        if (!flag) {
            System.out.println("Števila ni mogoče izraziti kot vsoto dveh praštevil");
        }

        sc.close();
    }

    public static boolean jePrastevilo(int st) {
        int stDeliteljev = 0;
        for (int i = 1; i <= st; i++) {
            if (st % i == 0) {
                stDeliteljev++;
            }
        }

        if (stDeliteljev == 2) {
            return true;
        }

        return false;
    }

}
