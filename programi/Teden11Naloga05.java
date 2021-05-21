import java.util.Scanner;

public class Teden11Naloga05 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stevilo = sc.nextInt();
        int stDeliteljev = 0;

        // Z:
        for (int x = 1; x <= stevilo; x++) {
            if (stevilo % x == 0) {
                stDeliteljev++;
                System.out.println(x);
            }

            if (stDeliteljev >= 5) {
                break;
            }
        }

        stDeliteljev = 0;
        // BREZ:
        for (int x = 1; x <= stevilo && !(stDeliteljev >= 5); x++) {
            if (stevilo % x == 0) {
                stDeliteljev++;
                System.out.println(x);
            }
        }

        sc.close();
    }

}
