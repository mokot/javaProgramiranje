public class LogicniOperatorji {
    public static void main(String[] args) {

        int stevilo1 = 1, stevilo2 = 2, stevilo3 = 9;
        boolean rezultat;

        rezultat = (stevilo1 > stevilo2) && (stevilo3 > stevilo1);
        System.out.println(rezultat);

        rezultat = (stevilo1 > stevilo2) || (stevilo3 > stevilo1);
        System.out.println(rezultat);

        rezultat = !rezultat;
        System.out.println(rezultat);
    }
}