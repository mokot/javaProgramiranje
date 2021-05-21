// 1 - 5 -> ocena
import java.util.Scanner;

public class Switch {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ocena = sc.nextInt();

        /* if (ocena == 1) {
            System.out.println("nezadostno");
        } else if (ocena == 2) {
            System.out.println("zadostno");
        } else if (ocena == 3) {
            System.out.println("dobro");
        } else if (ocena == 4) {
            System.out.println("pravdobro");
        } else if (ocena == 5) {
            System.out.println("odlicno");
        } else {
            System.out.println("neveljavna ocena");
        } */

        switch (ocena) {

            case (1):
                System.out.println("nezadostno");
                break;
            
            case (2):
                System.out.println("zadostno");
                break;

            case (3):
                System.out.println("dobro");
                break;
            
            case (4):
                System.out.println("pravdobro");
                break;
            
            case (5):
                System.out.println("odlicno");
                break;

            default:
                System.out.println("neveljavna ocena");
                break;
        }

        sc.close();
    }

}
