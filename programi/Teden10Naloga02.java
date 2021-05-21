import java.util.Scanner;

public class Teden10Naloga02 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int stevec = a; stevec <= b; stevec++) {
            System.out.println(stevec);
        }

        while (a <= b) {
            System.out.println(a);
            a++;
        }

        sc.close();
    }
}