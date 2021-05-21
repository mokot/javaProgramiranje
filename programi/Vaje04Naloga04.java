import java.util.Scanner;
import java.util.Arrays;

public class Vaje04Naloga04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] t = new int[n];
        for (int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
        }

        boolean razlicni = true;

        int[] tabelaStevcev = new int[n];

        for (int i = 0; i < t.length; i++) {
            int stevilo = t[i];

            for (int j = 0; j < t.length; j++) {
                if (i == j) {
                    continue;
                }

                int pomoznoStevilo = t[j];
                if (stevilo == pomoznoStevilo) {
                    razlicni = false;
                    tabelaStevcev[i]++;
                }
            }
        }  
        
        if (razlicni) {
            System.out.println("RAZLICNA");
        } else {
            // Posicemo najmanjse stevilo, ki ima stevec v tabeliStevcev vecji od 0
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < tabelaStevcev.length; i++) {
                if (tabelaStevcev[i] == 0) {
                    continue;
                }

                int stevilo = t[i];
                if (stevilo < min) {
                    min = stevilo;
                }
            }
            System.out.println(min);
        }

        sc.close();
    }
}
