public class PrenosParametrov {
    
    public static void main(String[] args) {

        int n = 10;
        char znak = '+';
        boolean prelom = true;

        zaporedje(n, znak, prelom);
    }

    public static void prelom(int n, char znak, boolean prelom) {
        for (int i = 1; i <= n; i++) {
            System.out.print(znak);
        }
        if (prelom) {
            System.out.println();
        }
    }
}
