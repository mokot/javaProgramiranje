import java.util.Scanner;

public class poskus01 {
    public static void main(String[] args) {

        System.out.print("Vnesite stevilo ucencev: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int st1 = 0, st2 = 0, st3 = 0, st4 = 0, st5 = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Vnesite oceno: ");
            
            int ocena = sc.nextInt();

            switch(ocena) {
                case 1:
                    st1++;
                    break;
                case 2:
                    st2++;
                    break;
                case 3:
                    st3++;
                    break;
                case 4:
                    st4++;
                    break;
                case 5:
                    st5++;
                    break;
            }
        }
        
        System.out.printf("1: %d%n", st1);
        System.out.printf("2: %d%n", st2);
        System.out.printf("3: %d%n", st3);
        System.out.printf("4: %d%n", st4);
        System.out.printf("5: %d%n", st5);
    }
}