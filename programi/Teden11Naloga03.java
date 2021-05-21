import java.util.Scanner;

public class Teden11Naloga03 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double stevilo = sc.nextDouble();

        stevilo = (stevilo >= 0) ? stevilo : -stevilo;

        System.out.println(stevilo);

        sc.close();
    }

}
