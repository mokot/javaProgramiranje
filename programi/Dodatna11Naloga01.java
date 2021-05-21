import java.util.Scanner;

public class Dodatna11Naloga01 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        char operator = sc.next().charAt(0);

        switch (operator) {

            case '+':
                System.out.printf("%d + %d = %d\n", a, b, a + b);
                break;

            case '-':
                System.out.printf("%d - %d = %d\n", a, b, a - b);
                break;

            case '*':
                System.out.printf("%d * %d = %d\n", a, b, a * b);
                break;

            case '/':
                System.out.printf("%d / %d = %.2f\n", a, b, (double) a / b);
                break;

            case '%':
                System.out.printf("%d % %d = %d\n", a, b, a % b);
                break;

        }

        sc.close();
    }

}
