import java.util.Scanner;

public class Vaje02Naloga09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int dolzinaN = 0;
        int pomoznoN = n;

        // Prestejemo koliko stevk ma stevilo n
        while (pomoznoN > 0) {
            dolzinaN++;
            pomoznoN = pomoznoN / 10;
        }

        // Izracunamo armstrongovo stevilo i^dolzina
        int armstrongovoStevilo = 0;
        pomoznoN = n;
        while (pomoznoN > 0) {
            int stevkaN = pomoznoN % 10;
            pomoznoN = pomoznoN / 10;

            armstrongovoStevilo = armstrongovoStevilo + (int) Math.pow(stevkaN, dolzinaN);
        }
        
        if (armstrongovoStevilo == n) {
            System.out.println("DA");
        } else {
            System.out.println("NE");
        }

        sc.close();
    }
}