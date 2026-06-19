import java.util.*;

public class b {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            long n = sc.nextLong();
            long x1 = sc.nextLong();
            long x2 = sc.nextLong();
            long k = sc.nextLong();

            long x = Math.abs(x1 - x2);

            long ans = Math.min(x, n - x);

            if (n < 4) {
                System.out.println(ans);
            } else {
                System.out.println(ans + k);
            }
        }

        sc.close();
    }
}