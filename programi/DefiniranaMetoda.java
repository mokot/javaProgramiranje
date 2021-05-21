import java.util.Scanner;

import java.lang.*;

public class DefiniranaMetoda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // prebere 2 stevili: max, min, pow (a,b)

        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int pow = (int) Math.pow(a, b);

        System.out.printf("max: %d\nmin: %d\npow: %d\n", max, min, pow);

        sc.close();
    }
}