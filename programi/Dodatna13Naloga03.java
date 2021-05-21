import java.util.Scanner;

public class Dodatna13Naloga03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dolzinaPoti = sc.nextInt();
        int prehojenaPot = sc.nextInt();
        int krajsaPot = sc.nextInt();

        int dan = 1;

        while (dolzinaPoti > 0 && prehojenaPot > 0) {
            int zacetek = dolzinaPoti;
            int konec = (dolzinaPoti - prehojenaPot) < 0 ? 0 : (dolzinaPoti - prehojenaPot);

            int dolzina = (zacetek < prehojenaPot) ? zacetek : prehojenaPot;

            System.out.printf("%d. dan: %d -> %d (dolzina %d)\n", dan, zacetek, konec, dolzina);

            dan++;
            dolzinaPoti = dolzinaPoti - prehojenaPot;
            prehojenaPot = prehojenaPot - krajsaPot;
        }

        sc.close();
    }
}