import java.util.Scanner; 

public class Dodatna17Naloga02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] tabelaStevil = new int[n];

        for (int i = 0; i < tabelaStevil.length; i++) {
            tabelaStevil[i] = sc.nextInt();
        }

        int vsota = 0;
        for (int stevilo: tabelaStevil) {
            vsota = vsota + stevilo;
        }

        System.out.println(vsota);

        sc.close();
    }
}