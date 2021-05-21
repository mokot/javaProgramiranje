import java.util.Scanner;

public class Vaje01Naloga06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int deljenec = sc.nextInt();
        int delitelj = sc.nextInt();

        int kolicnikInt = deljenec / delitelj;
        double kolicnik = (double) deljenec / delitelj;

        int mod = deljenec - delitelj * kolicnikInt;

        System.out.printf("deljenec / delitelj = %.1f\ndeljenec %% delitelj = %d\n", kolicnik, mod);

        sc.close();
    }
}