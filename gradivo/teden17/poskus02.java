import java.util.Scanner;

public class poskus02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Vnesite stevilo ucencev: ");
        int n = sc.nextInt();

        int[] ocene = new int[5];

        for (int i = 0; i < n; i++) {
            System.out.print("Vnesite oceno: ");
            int ocena = sc.nextInt();

            switch(ocena) {
                case 1:
                    ocene[0]++;
                    break;
                case 2:
                    ocene[1]++;
                    break;
                case 3:
                    ocene[2]++;
                    break;
                case 4:
                    ocene[3]++;
                    break;
                case 5:
                    ocene[4]++;
                    break;
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.printf("%d: %d%n", i + 1, ocene[i]);
        }
    }
}
