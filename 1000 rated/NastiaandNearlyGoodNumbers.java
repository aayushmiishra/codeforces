import java.util.*;
public class NastiaandNearlyGoodNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            long A = sc.nextLong();
            long B = sc.nextLong();

            if (B == 1) {
                System.out.println("NO");
            } else {

                long x = A * (B - 1);
                long y = A * (B + 1);
                long z = 2 * A * B;

                System.out.println("YES");
                System.out.println(x + " " + y + " " + z);
            }
        }
        sc.close();
    }
}