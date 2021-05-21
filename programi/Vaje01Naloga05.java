import java.util.Scanner;

public class Vaje01Naloga05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int deljenec, delitelj;
        System.out.print("Vnesite dve celi stevili: ");
        deljenec = sc.nextInt();
        delitelj = sc.nextInt();

        double kolicnik = (double) deljenec / delitelj;
        int mod = deljenec % delitelj;

        System.out.printf("deljenec / delitelj = %.1f\ndeljenec %% delitelj = %d\n", kolicnik, mod);

        sc.close();

    }
}