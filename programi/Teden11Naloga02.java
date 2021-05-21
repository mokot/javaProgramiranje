import java.util.Scanner;

public class Teden11Naloga02{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ocena = sc.nextInt();    

        System.out.println((ocena >= 50) ? "opravil" : "ni opravil");    

        sc.close();
    }

}
