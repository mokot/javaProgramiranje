import java.util.Scanner;

public class PogojniOperator {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stevilo = sc.nextInt();

        /* if (stevilo == 42) {
            System.out.println("odgovor obstaja");
        } else {
            System.out.println("navadno stevilo");
        } */

        System.out.println((stevilo == 42) ? "odgovor obstaja" : "navadno stevilo");

        sc.close();
    }

}
