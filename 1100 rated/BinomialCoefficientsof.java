import java.io.IOException;
import java.util.Scanner;

public class BinomialCoefficientsof {
    static final long MOD = 1000000007L;
    public void solve() throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] pw = new long[100002];
        pw[0] = 1;
        for (int i = 1; i < 100002; i++) {
            pw[i] = (2 * pw[i - 1]) % MOD;
        }

        while (t-- > 0) {

            int n = sc.nextInt();

            int[] narray = new int[n];
            int[] karray = new int[n];

            for (int i = 0; i < n; i++) {
                narray[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                karray[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                System.out.println(pw[karray[i]]);
            }
        }

        sc.close();
    }

    public static void main(String[] args) throws IOException {
        new BinomialCoefficientsof().solve();
    }
}