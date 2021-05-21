import java.util.Scanner;

public class Dodatna08Naloga06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char znak = sc.next().charAt(0);

        int stevilo = (int) znak;
        System.out.println(stevilo);

        // System.out.printf("%d\n", (int) znak);

        sc.close();
    }
}