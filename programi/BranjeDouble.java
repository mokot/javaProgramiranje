import java.util.Scanner;

//import java.util.InputMismatchException;

import java.util.Locale;

public class BranjeDouble {
    public static void main(String[] args) {

        /* 
        1. NACIN
        try {
            Scanner sc = new Scanner(System.in);

            double stevilo = sc.nextDouble();

            System.out.println(stevilo);
        } catch (InputMismatchException e) {
            System.out.println("Prislo je do napake!");
        } */

        /* 
        2. NACIN
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);

        double stevilo = sc.nextDouble();

        System.out.println(stevilo); */

        /* 
        3. NACIN
        Scanner sc = new Scanner(System.in);

        double stevilo = Double.parseDouble(sc.next()); */

        /*
        LINUX: locale -> export LC_NUMERIC="en_US.UTF-8"
        MAC: apple button -> system pref -> text/language -> formats -> us
        WINDOWS control panel -> region and language -> formats -> us
        */

    }
}
