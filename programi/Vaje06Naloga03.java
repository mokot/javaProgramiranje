import java.util.Scanner;

public class Vaje06Naloga03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stevec = 0;
        boolean zaporedje = true;

        // Prebermo prvi clen zaporedja
        int prvi = sc.nextInt();
        stevec++;

        while (sc.hasNextInt()) {
            int drugi = sc.nextInt();

            if (!zaporedje) {
                continue;
            }

            // Preverimo, ce spada st v zaporedje
            if (drugi % prvi == 0) {
                stevec++;
                prvi = drugi;
            } else {
                zaporedje = false;
            }
        }

        System.out.println(stevec);

        sc.close();
    }
}
