import java.util.Scanner; 

public class Dodatna17Naloga03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] tabelaStevil = new int[n];

        for (int i = 0; i < tabelaStevil.length; i++) {
            tabelaStevil[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int stevilo: tabelaStevil) {

            // ali je stevilo min
            if (stevilo < min) {
                min = stevilo;
            }

            // ali je stevilo max
            if (stevilo > max) {
                max = stevilo;
            }
        }

        System.out.printf("min: %d\nmax: %d\n", min, max);

        sc.close();
    }
}