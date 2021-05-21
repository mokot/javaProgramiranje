import java.util.Arrays;

public class Teden18Primer01 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        System.out.println(Arrays.toString(a));

        // Naredimo novo tabelo c, ki ima iste vrednosti kot a
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        int[] b = a;
        b[0] = 42;
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(c));

        System.out.println(a);
        System.out.println(b);
    }
}