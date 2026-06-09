import java.io.BufferedReader;
import java.util.StringTokenizer;

public class StalinSort {
    static void solve(BufferedReader br) throws Exception {
    int n = Integer.parseInt(br.readLine());

    long[] v = new long[n];
    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 0; i < n; i++) {
        v[i] = Long.parseLong(st.nextToken());
    }

    int ans = n;

    for (int i = 0; i < n; i++) {
        int res = 0;

        for (int j = i + 1; j < n; j++) {
            if (v[j] > v[i]) {
                res++;
            }
        }

        ans = Math.min(ans, res + i);
    }

    System.out.println(ans);
}
}
