public class Operatorji {
    public static void main(String[] args) {

        /*
        ARITMETICNI OPERATORJI:
        +   sestevanje  4 + 3 = 7
        -   odstevanje  4 - 3 = 1
        *   mnozenje    4 * 3 = 12
        /   deljenje    4 / 3 = 1   (4.0 / 3 = 1.3333333333333)
        %   mod         4 % 3 = 1

        5 + 3 * 4 = 5 + (3 * 4) = 17
        5 + 3 - 4 = 4
        */

        /*
        int vrednost = 5 + (3 * 4);
        int a = 5, b = 3, c = 4;
        vrednost = a + (b * c) - 1;
        // System.out.println(vrednost);
        */

        /*
        String beseda1 = "Programiranje ";
        String beseda2 = "je ";
        String beseda3 = "zabavno!";
        
        String stavek = beseda1 + beseda2 + beseda3;
        // System.out.println(stavek);
        */

        /*
        // PRETVORBA TIPOV
        int a = 5, b = 3;
        int c = a / b; // c = 1
        double d = (double) (a / b); // d = 1.0
        double e = ((double) a) / b; // e = 1.66...67
        double f = a / (double) b; // f = 1.66...67
        double g = ((double) a) / (double) b; // g = 1.66...67
        int h = (int) e;
        System.out.println(h);
        */

        /*
        ENOJNE OPERATORJI
        +   stevilo pretvori v pozitvni     +a
        -   stevilo pretvori v negativno    -a
        ++  poveca za 1                     ++a
        --  zmanjsa za 1                    --a

        ++a/--a -> rezeultat je nova vrednost ("najprej povecaj/zmanjsaj, potem uporabi")
        a++/a-- -> rezeultat je stare vrednost ("najprej uporabi, potem povecaj/zmanjsaj")
        */

        /*
        int a = 5;
        int b = 5;
        int c = a++;    
        int d = ++b;
        System.out.println(a + " " + b + " " + c + " " + d);
        */

        /*
        PRIMERJALNI OPERATORJI:
        >   vecji od            5 > 3
        <   manjsi od           4 < 9
        >=  vecje ali enako     8 >= 2
        <=  manjse ali enako    7 <= 7
        ==  enako kot           5 == 5
        !=  ni enako            5 != 4
        */

        /*
        LOGICNI OPERATORJI:
        &&  IN                  false && true = false
        ||  ALI                 false || true = true
        !   NE                  !false = true oz !true = false
        */

        /*
        boolean i1 = (3 > 2) && (6 < 5); // true && false = false
        boolean i2 = (0 < 8) || (6 == 5);
        boolean i3 = false || 2 == 8;
        boolean i4 = 1 > 6 || 4 == 3 || 6 < 9;
        // boolean i5 = 4 != 4 && a > b;
        boolean i6 = (5 == 6) == (7 == 8);
        boolean i7 = !(2 < 3) || !(5 == 4) && !true;
        System.out.println(i7);
        */

        /*
        BITNI OPERATORJI
        |   logicni ali
        &   logicni in
        ~   komplement (negacija)
        ^   xor
        <<  zamik v levo
        >>  zamik v desno  
        */

        /*
        OPERATORJI NA KRAJSE
        */

        /*
        int a = 42;
        a += 5; // a = a + 5;
        a -= 12; // a = a - 12;
        a *= 4; // a = a * 4;
        a /= 2; // a = a / 2;
        a %= 3; // a = a % 3;
        */
        
    }
}
