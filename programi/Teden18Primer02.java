import java.util.Arrays;

public class Teden18Primer02 {
    public static void main(String[] args) {
        int a = 42;
        int[] t = {1, 2, 3};
        int[] u = {4, 5, 6};
        int[] v = f(a, t, u);

        System.out.println(a);
        System.out.println(Arrays.toString(t));
        System.out.println(Arrays.toString(u));
        System.out.println(Arrays.toString(v));
    }

    public static int[] f(int aa, int[] tt, int[] uu) {
        aa = 66;
        tt[1] = 10;
        uu = new int[]{7, 8};
        return uu;
    }
}
