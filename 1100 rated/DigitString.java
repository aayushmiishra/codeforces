import java.util.*;

public class DigitString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            String s = sc.next();

            int n = s.length();

            int ans = 0;

            int[] f = new int[n + 1];
            int[] e = new int[n + 1];

            // prefix count of 1 and 3
            for (int i = 0; i < n; i++) {

                if (s.charAt(i) == '4') {
                    ans++;
                }

                if (i != 0) {
                    f[i] += f[i - 1];
                }

                if (s.charAt(i) == '1' ||
                    s.charAt(i) == '3') {

                    f[i]++;
                }
            }

            // suffix count of 2
            for (int i = n - 1; i >= 0; i--) {

                e[i] += e[i + 1];

                if (s.charAt(i) == '2') {
                    e[i]++;
                }
            }

            int tot = Integer.MAX_VALUE;

            for (int i = 0; i <= n; i++) {

                if (i == 0) {
                    tot = Math.min(tot, e[i]);
                }
                else {
                    tot = Math.min(
                        tot,
                        f[i - 1] + e[i]
                    );
                }
            }

            ans += tot;

            System.out.println(ans);
        } sc.close();
    }
}