public class poskus3 {
    public static void main(String[] args) {

        navpicniKrak();

        for (int i = 0; i < 2 * 5 + 1; i++) {
            System.out.print("+");
        }
        System.out.println();

        navpicniKrak();

    }

    public static void navpicniKrak() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" ");
            }
            System.out.print("+");
            System.out.println();
        }
    }
}
