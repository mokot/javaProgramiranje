public class Teden11Naloga06 {
    
    public static void main(String[] args) {

        // S:
        for (int stevilo = 1; stevilo <= 100; stevilo++) {
            if (!(stevilo % 3 == 0)) {
                continue;
            }

            System.out.println(stevilo);
        }

        // BREZ:
        for (int stevilo = 1; stevilo <= 100; stevilo++) {

            if (stevilo % 3 == 0) {
                System.out.println(stevilo);
            }
        }


    }

}
