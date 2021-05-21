import java.util.Scanner;

public class poskus7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int stevilo = sc.nextInt();

        kriz(stevilo);
        
    }

    public static void kriz(int n) {
        navpicniKrak(n);
        
        vodoravniKrak(n);

        navpicniKrak(n);
    }

    public static void navpicniKrak(int a) {
        for (int i = 0; i < a; i++) {
            presledek(a);
            System.out.print("+");
            System.out.println();
        }
    }

    public static void vodoravniKrak(int b) {
        for (int i = 0; i < 2 * b + 1; i++) {
            System.out.print("+");
        }
        System.out.println();
    }

    public static void presledek(int c) {
        for (int j = 0; j < c; j++) {
            System.out.print(" ");
        }
    }
}
