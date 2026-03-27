import java.util.*;

public class HelmetsinNightLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int p = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n; i++) b[i] = sc.nextInt();
            Integer[] idx = new Integer[n];
            for (int i = 0; i < n; i++) idx[i] = i;
            Arrays.sort(idx, (i, j) -> b[i] - b[j]);
            long cost = p;      // first direct share
            long left = n - 1;  // people left
            for (int id : idx) {
                if (left == 0) break;
                if (b[id] >= p) break;
                long take = Math.min(left, a[id]);
                cost += take * b[id];
                left -= take;
            }
            cost += left * p; // remaining via direct
            System.out.println(cost);
        }
    }
}
