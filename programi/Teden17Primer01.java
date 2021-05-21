import java.util.Scanner; 
import java.util.Arrays;

public class Teden17Primer01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] samoglasniki = {'a', 'e', 'i', 'o', 'u'};
        int[] stevila = {1, 2, 4};

        for (int indeks = 0; indeks < samoglasniki.length; indeks++) {
            System.out.print(samoglasniki[indeks] + " ");
        }
        System.out.println();

        for (int indeks = samoglasniki.length - 1; indeks >= 0; indeks--) {
            System.out.print(samoglasniki[indeks] + " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(samoglasniki));

        sc.close();
    }
}