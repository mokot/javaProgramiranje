import java.util.Scanner;

public class Teden16Primer01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* // T[] tabela = {element0, element1, ... , elementn};

        // t = [25, 42, 17, 54, 20, 36]
        int[] t = {25, 42, 17, 54, 20, 36};

        System.out.println(t[0]);
        System.out.println(t[4]);
        t[4] = -123;
        // t = [25, 42, 17, 54, -123, 36]
        System.out.println(t[4]);
        System.out.println(t.length);
        System.out.println(t[-2]);
        System.out.println(t[7]);

        // T[] tabela = new T[dolzina];
        int[] a = new int[5];
        int[] b = new int[10];
        // a = [0, 0, 0, 0, 0] */

        int n = sc.nextInt();

        int[] tabelaStevil = new int[n];

        for (int i = 0; i < n; i++) {
            int stevilo = sc.nextInt();
            tabelaStevil[i] = stevilo;
        }

        System.out.print("[");
        for (int i = 0; i < tabelaStevil.length; i++) {
            if (i != tabelaStevil.length - 1) {
                System.out.print(tabelaStevil[i] + ", ");
            } else {
                System.out.print(tabelaStevil[i]);
            }
        }
        System.out.println("]");

        System.out.print("[");
        for (int i = tabelaStevil.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(tabelaStevil[i] + ", ");
            } else {
                System.out.print(tabelaStevil[i]);
            }
        }
        System.out.println("]");

        sc.close();
    }
}
