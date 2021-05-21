import java.util.Scanner;

public class Dodatna09Naloga05 {
    public static void main(String[] argss) {
        Scanner sc = new Scanner(System.in);

        char znak = sc.next().charAt(0);

        int stevilo = (int) znak;

        if ((stevilo >= 65 && stevilo <= 90) || (stevilo >= 97 && stevilo <= 122)) {
            System.out.println("DA");
        } else {
            System.out.println("NE");
        }

    }
}