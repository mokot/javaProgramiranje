import java.util.Scanner;

public class Vaje02Naloga10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Stevec je v osnovi enak ena, saj je stevilo n prvi clen Collatzovega zaporedja
        int stevec = 1;

        // Izpis collatzovega zaporedja:
        System.out.printf("%d->", n);

        while (n != 1) {
            
            // Ce je trenutno stevilo sodo ga delimo z 2
            if (n % 2 == 0) {
                n = n / 2;
            }
            // Ce je trenutno stevilo liho ga mnozimo s 3 in mu pristejemo 1
            else {
                n = n * 3 + 1;
            }
            stevec++;

            // Izpis collatzovega zaporedja:
            System.out.printf("%d%s", n, n == 1 ? "\n" : "->");
        }

        System.out.println(stevec);

        sc.close();
    }
}