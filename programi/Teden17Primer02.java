import java.util.Scanner; 

public class Teden17Primer02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] samoglasniki = {'a', 'e', 'i', 'o', 'u'};

        for (char crka: samoglasniki) {
            System.out.print(crka + " ");
        }
        System.out.println();

        sc.close();
    }
}