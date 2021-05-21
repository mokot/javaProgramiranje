import java.util.Scanner; 

public class Teden17Naloga01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] tabelaStevil = new int[n];

        // Preberemo stevila:
        for (int i = 0; i < tabelaStevil.length; i++) {
            tabelaStevil[i] = sc.nextInt();
        }

        /*
        // Izpisemo stevila:
        for (int i = 0; i < tabelaStevil.length; i++) {
            System.out.print(tabelaStevil[i] + " ");
        }
        System.out.println(); 
        */

        // Izpisemo stevila:
        for (int stevilo: tabelaStevil) {
            System.out.print(stevilo + " ");
        }
        System.out.println();

        sc.close();
    }
}