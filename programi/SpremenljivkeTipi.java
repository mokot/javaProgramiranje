public class SpremenljivkeTipi {
    public static void main(String[] args) {

        int a = 3;
        int b = 4;
        System.out.println("a = " + a + " " + "b = " + b);

        a = b + 5;
        System.out.println("a = " + a + " " + "b = " + b);

        b = b - 3;
        System.out.println("a = " + a + " " + "b = " + b);

        a = 2 * a + b;
        System.out.println("a = " + a + " " + "b = " + b);

        /*
        
        PODATKOVNI TIPI:
        1. LOGICNA VREDNOST: [true, false] boolean
        2. CELA STEVILA:
            - byte (8 bitov) [-2^7, 2^7 -1] byte
            - short (16 bitov) [-2^15, 2^15 - 1] short
            - int (32 bitov)
            - long (64 bitov)
            0b ali 0x
        3. REALNA STEVILA:
            - float (32 bitov)
            - double (64 bitov)
        4. ZNAK:
            - char (8 bitov -> ASCII)
        5. NIZ:
            - String
        */

        boolean logicnaVrednost = true;
        int steviloInt = 12213213;
        double steviloDouble = -1323.9483294;
        char znak = 'A';
        String niz = "programiranje je zabavno";

        System.out.println(logicnaVrednost);
        System.out.println(steviloInt);
        System.out.println(steviloDouble);
        System.out.println(znak);
        System.out.println(niz);

    }
}
