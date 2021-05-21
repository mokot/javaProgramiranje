import java.util.Scanner;

public class Vaje06Naloga04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Tabela kalkulator:
        int[] kalkulator = {6, 2, 5, 5,	4, 5, 6, 3,	7, 6};

        int n = sc.nextInt();
        int[] stevila = new int[n];

        for (int i = 0; i < n; i++) {
            stevila[i] = sc.nextInt();
        }

        int[] crtice = new int[n];
        for (int i = 0; i < n; i++) {
            crtice[i] = steviloCrtice(stevila[i], kalkulator);
        }

        // Posiscemo stevilo, ki je sestavljeno iz najvec crtic
        int najStevilo = 0;
        int najCrtice = 0;

        for (int i = 0; i < n; i++) {
            int stevecCrtic = crtice[i];

            if (stevecCrtic > najCrtice) {
                najCrtice = stevecCrtic;
                najStevilo = stevila[i];
            }
        }

        System.out.printf("%d [%d]\n", najStevilo, najCrtice);

        sc.close();
    }

    // Metoda, ki nam izracuna, iz koliko crtice je setavljeno neko stevilo
    public static int steviloCrtice(int stevilo, int[] kalkulator) {
        int stevecCrtic = 0;

        while (stevilo > 0) {
            int stevka = stevilo % 10;
            stevilo = stevilo / 10;

            stevecCrtic = stevecCrtic + kalkulator[stevka];
        }

        return stevecCrtic;
    }
}
