import java.util.Scanner; 

public class Dodatna17Naloga04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] tabelaStevil = new int[n];

        for (int i = 0; i < tabelaStevil.length; i++) {
            tabelaStevil[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int minIndeks = -1;
        int maxIndeks = -1;

        for (int indeks = 0; indeks < tabelaStevil.length; indeks++) {

            int stevilo = tabelaStevil[indeks];

            // ali je stevilo min
            if (stevilo < min) {
                min = stevilo;
                minIndeks = indeks;
            }

            // ali je stevilo max
            if (stevilo > max) {
                max = stevilo;
                maxIndeks = indeks;
            }
        }
        
        // minIndeks: 2 [min: -19]
        System.out.printf("minIndeks: %d [min: %d]\n", minIndeks, tabelaStevil[minIndeks]);
        System.out.printf("maxIndeks: %d [max: %d]\n", maxIndeks, tabelaStevil[maxIndeks]);

        sc.close();
    }
}