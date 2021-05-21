import java.util.Scanner;

public class LastnaMetoda {

    // Metoda, ki nam izpise "Programiranje je zabavno"
    public static void prvaMetoda() {
        System.out.println("Programiranje je zabavno!");
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        prvaMetoda();
        prvaMetoda();

        prvaMetoda();
        prvaMetoda();
        prvaMetoda();

        sc.close();
    }
}