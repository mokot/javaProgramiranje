import java.util.Scanner;

public class Vaje06Naloga01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] prvic = new int[n];
        int[] drugic = new int[n];

        // Preberemo podakte in jih vstavimo v tabelo
        for (int i = 0; i < n; i++) {
            int prviRezultat = sc.nextInt();

            // Primer, ko je tekmovalec diskvalificiran v prvem teku
            if (prviRezultat == 0) {
                continue;
            }

            prvic[i] = prviRezultat;

            int drugiRezultat = sc.nextInt();

            // Primer, ko je tekmovalec diskvalificiran v drugem teku
            if (drugiRezultat == 0) {
                continue;
            }

            drugic[i] = drugiRezultat;
        }

        // Poiscemo najbolsega tekmovalce in njegovo startno stevilko oz NIHCE
        boolean nihce = true;
        int najRezultat = Integer.MAX_VALUE;
        int najTekmovalec = -1;

        for (int tekmovalec = 0; tekmovalec < n; tekmovalec++) {
            int prviRezultat = prvic[tekmovalec];
            int drugiRezultat = drugic[tekmovalec];

            // Nasli smo tekmovalce, ki ni bil diskvalificiran
            if (prviRezultat != 0 && drugiRezultat != 0) {
                nihce = false;

                int vsotaRezultatov = prviRezultat + drugiRezultat;
                if (vsotaRezultatov < najRezultat) {
                    najRezultat = vsotaRezultatov;
                    najTekmovalec = tekmovalec;
                }
            }
        }

        if (nihce) {
            System.out.println("NIHCE");
        } else {
            System.out.printf("%d [%d]\n", najTekmovalec + 1, najRezultat);
        }

        sc.close();
    }
}
