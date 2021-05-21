import java.util.Scanner;

public class Teden11Naloga01 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mesec = sc.nextInt();

        /**
            31: 1 3 5 7 8 10 12
            30: 4 6 9 11
            28: 2
         */

        /* if (mesec == 1 || mesec == 3 || mesec == 5 || mesec == 7 || mesec == 8 || mesec == 10 || mesec == 12) {
            System.out.println(31);
        } else if (mesec == 4 || mesec == 6 || mesec == 9 || mesec == 11) {
            System.out.println(30);
        } else {
            System.out.println(28);
        } */

        switch (mesec) {

            case (1):
            case (3):
            case (5):
            case (7):
            case (8):
            case (10):
            case(12):
                System.out.println(31);
                break;

            case (4):
            case (6):
            case (9):
            case (11):
                System.out.println(30);
                break;
            
            default:
                System.out.println(28);

        }

        sc.close();
    }

}
