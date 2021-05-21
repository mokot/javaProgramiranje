import java.util.Scanner;

public class Teden10Naloga06 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        /**
            stTekmovalca razultat
            1            635
            2            680
            3            671
            ...          ...
         */

        int stTekmovalcev = sc.nextInt();

        int najRezultat = -1;
        int najTekmovalec = -1;

        for (int stTekmovalca = 1; stTekmovalca <= stTekmovalcev; stTekmovalca++) {
            int rezultat = sc.nextInt();

            if (rezultat > najRezultat) {
                najRezultat = rezultat;
                najTekmovalec = stTekmovalca;
            }
        }

        System.out.printf("Najboljsi je %d. atlet (%d).\n", najTekmovalec, najRezultat);

        sc.close();
    }
}