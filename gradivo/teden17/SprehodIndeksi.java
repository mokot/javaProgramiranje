import java.util.Arrays;

public class SprehodIndeksi {
    public static void main(String[] args) {
        char[] samoglasniki = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < samoglasniki.length; i++) {
            System.out.printf("element na indeksu %d: %c%n", i, samoglasniki[i]);
        }

        // System.out.println(samoglasniki);
        // System.out.println(Arrays.toString(samoglasniki));
    }
}