import java.util.Scanner;

public class Vaje04Naloga05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();

        int[] t = new int[n];
        for (int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
        }

        int minOddaljenost = Integer.MAX_VALUE;
        int minStevilo = 0;
        int minIndeks = -1;

        for (int i = 0; i < t.length; i++) {
            int stevilo = t[i];

            int oddaljenost = (int) Math.abs(stevilo - k);

            if (oddaljenost < minOddaljenost) {
                minOddaljenost = oddaljenost;
                minStevilo = stevilo;
                minIndeks = i;
            }
        }

        System.out.println(minStevilo + " [" + minIndeks + "]");

        sc.close();
    }
}
