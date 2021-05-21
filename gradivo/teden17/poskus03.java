import java.util.Scanner;

public class poskus03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Vnesite stevilo ucencev: ");
        int n = sc.nextInt();

        int[] ocene = new int[5];

        for (int i = 0; i < n; i++) {
            System.out.print("Vnesite oceno: ");
            int ocena = sc.nextInt();

            ocene[ocena - 1]++;
        }

        for (int i = 0; i < 5; i++) {
            System.out.printf("%d: %d%n", i + 1, ocene[i]);
        }
    }
}