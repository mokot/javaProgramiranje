import java.util.Scanner;

public class Dodatna09Naloga03 {
    public static void main(String[] argss) {
        Scanner sc = new Scanner(System.in);

        char znak = sc.next().charAt(0);

        // a e i o u
        if (znak == 'a' || znak == 'e' || znak == 'i' || znak == 'o' || znak == 'u') {
            System.out.println("samoglasnik");
        } else {
            System.out.println("soglasnik");
        }

    }
}