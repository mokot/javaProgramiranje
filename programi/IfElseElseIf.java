import java.util.Scanner;

public class IfElseElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // PREBEREMO DVE STEVILO 
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 1. ALI JE STEVILO a VECJE OD 0
        if (a > 0) {
            System.out.println("Stevilo a je vecje od 0.");
        }

        // 2. ALI JE STEVILO a VECJE OD STEVILA b
        if (a > b) {
            System.out.println("Stevilo a je vecje od stevila b.");
        } else {
            System.out.println("Stevilo b je vecje od stevila a.");
        }

        // 3. ALIE JE STEVILO a VECJE OD STEVILA b OZ ALI STA STEVILI ENAKI
        /* if (a > b) {
            System.out.println("Stevilo a je vecje od stevila b.");
        } else {
            if (a == b) {
                System.out.println("Stevilo a in b sta enaki.");
            } else {
                System.out.println("Stevilo b je vecje od stevila a.");
            }
        } */
        if (a > b) {
            System.out.println("Stevilo a je vecje od stevila b.");
        } else if (a < b) {
            System.out.println("Stevilo b je vecje od stevila a.");
        } else {
            System.out.println("Stevili a in b sta enaki.");
        }

    }
}