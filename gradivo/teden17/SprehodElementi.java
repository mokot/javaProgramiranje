public class SprehodElementi {
    public static void main(String[] args) {
        char[] samoglasniki = {'a', 'e', 'i', 'o', 'u'};
        int i = 0;

        for (char crka: samoglasniki) {
            System.out.printf("element na indeksu %d: %c%n", i, crka);
            i++;
        }
    }
}