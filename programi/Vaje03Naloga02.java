import java.util.Scanner;

public class Vaje03Naloga02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int stevec = 0;

        for (int stevilo = a; stevilo <= b; stevilo++) {
            boolean steviloJePrastevilo = jePrastevilo(stevilo);

            if (steviloJePrastevilo) {
                stevec++;
                System.out.println(stevilo);
            }            
        }

        System.out.println(stevec);

        sc.close();
    }

    public static boolean jePrastevilo(int n) {
        int stDeliteljev = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                stDeliteljev++;
            }
        }

        if (stDeliteljev == 2) {
            return true;
        }

        return false;
    }
}