import java.util.Scanner;

public class Dodatna11Naloga05 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        for (int x = m; x <= n; x++) {
            System.out.println(x * x);
        }

        sc.close();
    }

}
