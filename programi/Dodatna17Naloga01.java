import java.util.Scanner; 

public class Dodatna17Naloga01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] tabelaStevil = new int[n];

        for (int i = 0; i < tabelaStevil.length; i++) {
            tabelaStevil[i] = sc.nextInt();
        }

        // [1, 5, 3, 6]
        System.out.print("[");
        for (int i = tabelaStevil.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(tabelaStevil[i]);
            } else {
                System.out.print(tabelaStevil[i] + ", ");
            }
        }
        System.out.print("]");
        System.out.println();

        sc.close();
    }
}