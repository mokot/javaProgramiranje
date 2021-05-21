import java.util.Scanner;

public class Teden13Naloga01 {

    // Metoda, ki nam izrise navpicni krak:
    public static void navpicniKrak(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        return;
    }

    // Metoda, ki nam izrise vodoravni krak:
    public static void vodoravniKrak(int n) {
        for (int i = 0; i < 2 * n + 1; i++) {
            System.out.print("* ");
        }
        System.out.println();
        return;
    }

    // Metoda, ki nam izrise kriz:
    public static void izrisiKriz(int n) {
        navpicniKrak(n);
        
        vodoravniKrak(n);
        
        navpicniKrak(n);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        izrisiKriz(n);

        /**
        n = 4:
                *
                *
                *
                *
        * * * * * * * * *
                *
                *
                *
                *
         */

        /* navpicniKrak(n);
        
        vodoravniKrak(n);
        
        navpicniKrak(n); */


        /* // Navpicni krak:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        // Vodoravni krak:
        for (int i = 0; i < 2 * n + 1; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // Navpicni krak:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        } */

        sc.close();
    }
}