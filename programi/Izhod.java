public class Izhod {
    public static void main(String[] args) {

        // System.out.println("Pozdravljen, Svet " + 232432);
        // System.out.print("Pozdravljen, Svet " + 232432);
        // System.out.printf("programiranje je zabavno %d\n", 1321432);

        /*
            %d = cela stevila (byte, short, int, long)
            %f = relna stevila (float, double)
            %c = znak (char)
            %b = logicna vrednost (boolean)
            %s = niz (String)

            %n = \n = prelom vrstice
            \t = tab
            %% = znak procent
        */

        int stevilo = 42;
        double realno = 3.14;
        char znak = 'a';
        boolean log = false;
        String niz = "Programiranje je zabavno";

        System.out.printf("celo stevilo je enako: %d\nrealno stevilo je enako: %f\n", stevilo, realno);
        System.out.println();
        System.out.printf("znak v programu je enak %c\nAli je programiranje zabavno? -> %b\n", znak, log);
        System.out.print("\n");

        System.out.printf("Znana rek pravi: %s\n\n", niz);

        /*
        OBLIKOVNA DOLOCILA:
        %.wx -> x tip (d, b, s ..), w = sirina izpisa (desna poravnava)
        %-wx -> x tip (d, b, s ..), w = sirina izpisa (leva poravnava)
        %0wx -> x tip (d, b, s ..), w = sirina izpisa, 0 vsebina je polnjena z 0

        %.df -> f = realno stevilo, d = stevilo zapisa v decimalnih mestih
        */

        System.out.printf("Realno stevilo zapisano na 2 decimalni mesti: %.2f\n", realno);
        System.out.printf("Celo stevilo z vodilnimi niclami: %5da\n", stevilo);
        System.out.printf("Celo stevilo z vodilnimi niclami: %-5da\n", stevilo);
        System.out.printf("Celo stevilo z vodilnimi niclami: %05d\n", stevilo);

    }
}