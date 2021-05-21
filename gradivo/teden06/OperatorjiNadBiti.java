public class OperatorjiNadBiti {
    public static void main(String[] args) {

        int stevilo1 = 12, stevilo2 = 25, rezultat;

        rezultat = stevilo1 | stevilo2;
        System.out.println(rezultat);
        
        rezultat = stevilo1 & stevilo2;
        System.out.println(rezultat);

        int stevilo = 35;
        rezultat = ~stevilo;
        System.out.println(rezultat);

        rezultat = stevilo1 ^ stevilo2;
        System.out.println(rezultat);

        stevilo = 212;
        System.out.println(stevilo << 1);
        System.out.println(stevilo << 0);
        System.out.println(stevilo << 4);

        System.out.println(stevilo >> 1);
        System.out.println(stevilo >> 0);
        System.out.println(stevilo >> 8);
    }
}
