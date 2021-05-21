import java.util.Scanner;

public class Finale04 {

    public static boolean lokalnoPravilno(int[] tabela, int indeks) {
        boolean prav = false;
        if (((indeks == 0 || tabela[indeks-1] <= tabela[indeks]) && 
            (indeks == tabela.length-1 || tabela[indeks] <= tabela[indeks + 1]))) 
            prav = true;
        return prav;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] vojaki = new int[n];

        for (int i = 0; i < n; i++) {
            vojaki[i] = sc.nextInt();
        }

        boolean nobeden = true;
        for (int i = 0; i < n; i++) {
            if (lokalnoPravilno(vojaki, i)) {
                nobeden = false;
                System.out.println(i);
            }
        }

        if (nobeden) System.out.println("NOBEDEN");
    }
}
