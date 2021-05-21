import java.util.Scanner;

public class Teden09Naloga02 {
    public static void main(String[] argss) {
        Scanner sc = new Scanner(System.in);

        int procenti = sc.nextInt();

        /*
        0 - 49 = 1
        50 - 64 = 2
        65 - 79 = 3
        80 - 89 = 4
        90 - 100 = 5
        */

        if (procenti < 50) {
            System.out.println("1");
        } else if (procenti < 65) {
            System.out.println("2");
        } else if (procenti < 80) {
            System.out.println("3");
        } else if (procenti < 90) {
            System.out.println("4");
        } else if (procenti <= 100) {
            System.out.println("5");
        } else {
            System.out.println("NAPAKA");
        }
    }
}