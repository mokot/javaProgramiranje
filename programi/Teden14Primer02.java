// Program, ki prebere polmer krogle in izracun njen volumen

import java.util.Scanner;

public class Teden14Primer02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double polmer = sc.nextDouble();
        final double PI = 3.14;

        double v = volumenKrogle(polmer, PI);

        // cm -> dm
        v = v / 1000;

        System.out.println("V[dm^3]: " + v);

        sc.close();
    }

    public static double volumenKrogle(double r, double pi) {
        // V = 4 / 3 * pi * r^3
        double volumen;

        volumen = 4 / 3 * pi * Math.pow(r, 3);

        System.out.println("V[cm^3]: " + volumen);
        return volumen;
    }


}