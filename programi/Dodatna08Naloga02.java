import java.util.Scanner;

public class Dodatna08Naloga02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stevilo = sc.nextInt();
        
        // stevilo = stevilo + 1;
        // ++stevilo;
        stevilo += 1;
        System.out.println(stevilo);

        sc.close();
    }
}