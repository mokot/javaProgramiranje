import java.util.Scanner;
import java.lang.Math; 

public class Vaje02Naloga07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt(); // y >= 0

        // x^y

        // Math.pow(a,b) = a^b
        int potenciranoSt2 = (int) Math.pow(x, y);

        int potenciranoSt = 1;
        while (y > 0) {
            potenciranoSt = potenciranoSt * x;
            y--;
        }

        System.out.println(potenciranoSt);
        System.out.println(potenciranoSt2);

        sc.close();
    }
}