public class OperatorjiNaKrajse {
    public static void main(String[] args) {

        int stevilo1, stevilo2;
        stevilo1 = stevilo2 = 0;

        stevilo1 = stevilo1 + 42;
        stevilo2 += 42;

        stevilo1 = stevilo1 - 18;
        stevilo2 -= 18;

        stevilo1 = stevilo1 * 2;
        stevilo2 *= 2;

        stevilo1 = stevilo1 / 6;
        stevilo2 /= 6;

        stevilo1 = stevilo1 % 5;
        stevilo2 %= 5;

        System.out.println(stevilo1);
        System.out.println(stevilo2);
    }
}
