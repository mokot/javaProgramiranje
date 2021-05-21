import java.util.Scanner;

public class Vaje02Naloga08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int pomoznoStevilo = n;
        int obratnoStevilo = 0;

        // Obrnemo stevilo n -> na koncu bo vrednost obratnegaStevila enaka obrnjeni vrenosti n
        while (pomoznoStevilo > 0) {
            int stevkaN = pomoznoStevilo % 10;
            pomoznoStevilo = pomoznoStevilo / 10;

            obratnoStevilo = obratnoStevilo * 10 + stevkaN;
        }

        // Ce je stevilo n enako obratnemu stevilu, potem je stevilo palindrom
        if (n == obratnoStevilo) {
            System.out.println("DA");
        } else {
            System.out.println("NE");
        }

        sc.close();
    }
}