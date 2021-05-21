import java.util.Scanner;

public class Vaje06Naloga02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Stevca, ki nam povesta, koliko kovancev imamo v blagajni
        int stevecEna = 0;
        int stevecDva = 0;

        boolean bankrot = false;

        while (sc.hasNextInt()) {
            int kovanec = sc.nextInt();

            // Dobili smo kovanec 1
            if (kovanec == 1) {
                stevecEna++;
            }

            // Dobili smo kovanec 2 (moramo vrnit kovanec 1)
            if (kovanec == 2) {
                stevecDva++;
                stevecEna--;
            }

            // Preverimo ce smo OK
            if (stevecEna < 0) {
                bankrot = true;
            }
        }

        if (bankrot) {
            System.out.println("BANKROT");
        } else {
            System.out.println(stevecEna + " " + stevecDva);
        }

        sc.close();
    }
}
