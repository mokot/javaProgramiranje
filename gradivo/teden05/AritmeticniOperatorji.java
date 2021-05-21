public class AritmeticniOperatorji {
    public static void main(String[] args) {

        double stevilo1 = 12.4, stevilo2 = 3.6, rezultat;

        rezultat = stevilo1 + stevilo2;
        System.out.println("stevilo1 + stevilo2 = " + rezultat);

        rezultat = stevilo1 - stevilo2;
        System.out.println("stevilo1 - stevilo2 = " + rezultat);

        rezultat = stevilo1 * stevilo2;
        System.out.println("stevilo1 * stevilo2 = " + rezultat);

        rezultat = stevilo1 / stevilo2;
        System.out.println("stevilo1 / stevilo2 = " + rezultat);

        rezultat = stevilo1 % stevilo2;
        System.out.println("stevilo1 % stevilo2 = " + rezultat);

        String beseda1 = "Programiranje ", beseda2 = "je ", beseda3 = "zabavno!", rezultatNiz;
        rezultatNiz = beseda1 + beseda2 + beseda3;
        System.out.println(rezultatNiz);
    }
}