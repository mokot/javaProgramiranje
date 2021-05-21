import java.util.Scanner;

public class Vaje03Naloga05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // stevilo -> [a, b]
        // 10 - 20

        int maxClen = 0;
        int maxDolzina = 0;

        for (int stevilo = a; stevilo <= b; stevilo++) {
            // 10 (15)
            // 11 (17)
            // 12 (13)
            // ...
            // 18 (21)
            // ...
            int dolzinaC = steviloCollatz(stevilo);

            // 1: 15 > 0 -> 10
            // 2: 17 > 15 -> 11
            // 3: 12 > 15 -> F
            // ...
            // 9: 21 > 17 -> 21
            // ...
            if (dolzinaC > maxDolzina) {
                // maxDolzina = 15
                // maxDolzina = 17
                // ...
                // maxDolzina = 21
                // ...
                maxDolzina = dolzinaC;
                // maxClen = 10
                // maxClen 11
                // maxClen = 18
                // ...
                maxClen = stevilo;
            }
        }

        System.out.printf("%d, %d\n", maxClen, maxDolzina);

        sc.close();
    }

    public static int steviloCollatz(int n) {
        int stevec = 0;

        // n = 18
        while (n != 1) {
            //System.out.printf("%d -> ", n);
            // 18 -> 9 -> 28 -> 14 -> ... -> 2
            stevec++;

            if (n % 2 == 0) {
                // n = n / 2;
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
        }

        //System.out.println(1);
        stevec++;
        // ... -> 1
        //System.out.println(stevec);

        return stevec;
    }

}