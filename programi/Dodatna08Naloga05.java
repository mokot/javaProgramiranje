import java.util.Scanner;

public class Dodatna08Naloga05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stevilo = sc.nextInt();

        char znak = (char) stevilo;
        System.out.println(znak);

        // System.out.printf("%c\n", (char) stevilo);

        sc.close();
    }
}