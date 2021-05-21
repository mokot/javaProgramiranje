import java.util.Scanner;

public class Dodatna10Naloga01 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int stevilo = sc.nextInt();
        int stevec = 0;

        for (int i = 1; i <= stevilo; i++) {
            if (stevilo % i == 0) {
                stevec++;
                System.out.println(i);
            }
        }

        System.out.println(stevec);

        sc.close();
    }
}