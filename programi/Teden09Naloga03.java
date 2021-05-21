import java.util.Scanner;

public class Teden09Naloga03 {
    public static void main(String[] argss) {
        Scanner sc = new Scanner(System.in);

        int leto = sc.nextInt();

        // 4 IN ni deljivo s 100, ALI če je deljivo s 400
        if ((leto % 4 == 0 && leto % 100 != 0) || (leto % 400 == 0)) {
            System.out.println("DA");
        } else {
            System.out.println("NE");
        }

    }
}