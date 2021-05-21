import java.util.Scanner;

public class Dodatna13Naloga05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Stevilo n
        int steviloZgoscenk = sc.nextInt();

        // Stevilo k
        int prostorZgoscenke = sc.nextInt();

        int stevilkaZgoscenke = 1;
        int prostorNaZgoscenki = 0;

        while (sc.hasNextInt()) {

            int steviloPodatkov = sc.nextInt();

            if (!(prostorNaZgoscenki + steviloPodatkov <= prostorZgoscenke)) {
                stevilkaZgoscenke++;
                prostorNaZgoscenki = 0;
            }

            if (stevilkaZgoscenke > steviloZgoscenk) {
                break;
            }

            prostorNaZgoscenki = prostorNaZgoscenki + steviloPodatkov;

            System.out.printf("%d EP -> zgoscenka %d (%d EP)\n", steviloPodatkov, stevilkaZgoscenke, prostorNaZgoscenki);

        }

        sc.close();
    }
}