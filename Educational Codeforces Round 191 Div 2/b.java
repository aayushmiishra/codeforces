import java.util.*;

public class b {

    static final long INF = (long) 1e15;

    static void solve(Scanner sc) {

        int n = sc.nextInt();
        int k = sc.nextInt();

        String s = sc.next();

        int[] ans = new int[n];
        long best = INF;

        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                left.add(i);
            } else {
                right.add(i);
            }
        }

        for (int x = 0; x <= k; x++) {

            int xx = x;
            int yy = k - xx;

            StringBuilder a = new StringBuilder();
            int[] cur = new int[n];

            for (int i = n - 1; i >= 0; i--) {
                if (s.charAt(i) == ')' && yy > 0) {
                    cur[i] = 1;
                    yy--;
                }
            }

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '(' && xx > 0) {
                    cur[i] = 1;
                    xx--;
                }
            }

            for (int i = 0; i < n; i++) {
                if (cur[i] == 0) {
                    a.append(s.charAt(i));
                }
            }

            int bal = 0;
            int curans = 0;

            for (int i = 0; i < a.length(); i++) {

                char ch = a.charAt(i);

                if (ch == '(') {
                    bal++;
                } else {
                    if (bal > 0) {
                        bal--;
                        curans++;
                    }
                }
            }

            if (curans < best) {
                best = curans;
                ans = cur.clone();
            }
        }

        for (int x : ans) {
            System.out.print(x);
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            solve(sc);
        }
    }
}