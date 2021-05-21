import java.util.Scanner;

public class naloga01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hz = sc.nextInt();
        int mz = sc.nextInt();

        int hk = sc.nextInt();
        int mk = sc.nextInt();

        int d = sc.nextInt();

        do {
            System.out.printf("%02d:%02d%n", hz, mz);

            mz += d;
            if (mz >= 60) {
                hz += mz / 60;
                mz %= 60;
            }

            if (hz == hk && mz > mk) break;
            
        } while (hz <= hk);
    }
}
