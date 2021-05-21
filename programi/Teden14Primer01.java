import java.util.Scanner;

public class Teden14Primer01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char znak = sc.next().charAt(0);
        boolean prelom = sc.nextBoolean();

        metoda(n, znak, prelom);

        sc.close();
    }

    public static void metoda(int st, char c, boolean p) {
        for (int i = 0; i < st; i++) {
            System.out.print(c + " ");
        }

        if (p) {
            System.out.println();
        }

        return;
    }
}
