import java.io.*;
import java.util.*;

public class b {

    static final long MOD = 998244353L;
    static final long INF = (long) 1e18;

    static void solve(Scanner sc) {
        long n = sc.nextLong();

        long ans = 0;

        for (long b = 1; b <= n; b++) {
            long cnt = n / b;
            ans += cnt * cnt;
        }

        System.out.println(ans);
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int testcases = sc.nextInt();

        while (testcases-- > 0) {
            solve(sc);
        }

        sc.close();
    }
}