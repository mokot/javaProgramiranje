import java.util.Scanner; 

public class Dodatna17Naloga05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        int[] tabelaStevil = new int[2 * k + 1];

        for (int i = 0; i < tabelaStevil.length; i++) {
            tabelaStevil[i] = sc.nextInt();
        }

        // 2 10 8 4 9 -6 6 1 3 -4 -2

        for (int i = 0; i < tabelaStevil.length; i++) {

            int stevilo = tabelaStevil[i];

            int stevecVecjih = 0;
            int stevecManjsih = 0;

            for (int j = 0; j < tabelaStevil.length; j++) {

                if (j == i) {
                    continue;
                }

                int pomoznoStevilo = tabelaStevil[j];

                // Preverimo ce je stevilo vecje oz manjse
                if (pomoznoStevilo < stevilo) {
                    stevecManjsih++;
                } else if (pomoznoStevilo > stevilo) {
                    stevecVecjih++;
                }
            }

            if (stevecVecjih == k && stevecManjsih == k) {
                System.out.println(stevilo);
                break;
            }
        }

        sc.close();
    }
}