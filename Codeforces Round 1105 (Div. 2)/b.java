import java.io.*;
import java.util.*;

public class b {

    static final long MOD = 998244353L;

    static long modPow(long base, long exp) {
        long res = 1;
        base %= MOD;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                res = (res * base) % MOD;
            }
            base = (base * base) % MOD;
            exp >>= 1;
        }

        return res;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringBuilder ans = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            long n = Long.parseLong(st.nextToken());
            long m = Long.parseLong(st.nextToken());
            long r = Long.parseLong(st.nextToken());
            long c = Long.parseLong(st.nextToken());

            long k = (r - 1) * m + (c - 1) * (n - r + 1);

            ans.append(modPow(2, k)).append('\n');
        }

        System.out.print(ans);
    }
}