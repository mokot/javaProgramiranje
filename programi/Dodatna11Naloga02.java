import java.util.Scanner;

public class Dodatna11Naloga02 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dan = sc.nextInt();

        switch (dan) {

            case 1:
                System.out.println("pon");
                break;

            case 2:
                System.out.println("tor");
                break;

            case 3:
                System.out.println("sre");
                break;

            case 4:
                System.out.println("cet");
                break;

            case 5:
                System.out.println("pet");
                break;

            case 6:
                System.out.println("sob");
                break;

            case 7:
                System.out.println("ned");
                break;

            default:
                System.out.println("neveljaven dan");
                break;

        }

        sc.close();
    }

}
