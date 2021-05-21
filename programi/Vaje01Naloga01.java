import java.util.Scanner;

public class Vaje01Naloga01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stevilo;
        stevilo = sc.nextInt();
        
        int petkratnik = stevilo * 5;
        System.out.println(petkratnik);

        sc.close();
    }
}