import java.util.Scanner;

public class Vaje02Naloga06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int vzvratnoN = 0;

        int pomoznoN = n;
        while (pomoznoN > 0) {
            // 1234
            int stevkaN = pomoznoN % 10;
            pomoznoN = pomoznoN / 10;

            vzvratnoN = vzvratnoN * 10 + stevkaN;
        }

        System.out.println(vzvratnoN);

        sc.close();
    }
}