import java.util.Scanner;

public class naloga02 {

    public static int izracunajDolzino(long stevilo) {
        int stevec = 0;
        while (stevilo > 0) {
            stevilo /= 10;
            stevec++;
        }
        return stevec;
    }

    public static long potenciraj(int stevilo) {
        long potenca = 1;
        while (stevilo > 0) {
            potenca *= 10;
            stevilo--;
        }
        return potenca;
    }

    public static int prvaStevka(long stevilo) {
        while (stevilo > 10) {
            stevilo /= 10;
        }
        return (int) stevilo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();

        int dolzinaM = izracunajDolzino(m);

        for (int i = 1; i <= dolzinaM; i++) {
            int stevkaM = prvaStevka(m);
            long potencaM = potenciraj(dolzinaM - i);
            m -= stevkaM * potencaM;
            
            int zeljenoStevilo = 0;
            int dolzinaN = izracunajDolzino(n);
            for (int j = 1; j <= stevkaM; j++) {
                int stevkaN = prvaStevka(n);
                long potencaN = potenciraj(dolzinaN - j);
                n -= stevkaN * potencaN;
                zeljenoStevilo = zeljenoStevilo * 10 + stevkaN;
            }

            System.out.println(zeljenoStevilo);
        }
    }
}
