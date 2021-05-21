import java.util.Scanner;

public class Vhod {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int steviloInt = sc.nextInt();
        long steviloLong = sc.nextLong();
        float steviloFloat = sc.nextFloat();
        double steviloDouble = sc.nextDouble();
        char znak = sc.next().charAt(0); // NE nextChar()
        boolean logicnaVrednost = sc.nextBoolean();
        String niz = sc.nextLine();

        System.out.println(steviloInt);
        System.out.println(steviloLong);
        System.out.println(steviloFloat);
        System.out.println(steviloDouble);
        System.out.println(znak);
        System.out.println(logicnaVrednost);
        System.out.println(niz);
    }
}
