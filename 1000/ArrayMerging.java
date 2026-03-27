import java.util.*;

public class ArrayMerging {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int[] c = new int[2 * n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                c[i] = a[i];
            }for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
                c[i + n] = b[i];
            }
            Arrays.sort(c);
            int maxLen = 1;
            int len = 1;
            for (int i = 1; i < 2 * n; i++) {
                if (c[i] == c[i - 1]) len++;
                else len = 1;
                maxLen = Math.max(maxLen, len);
            }
            System.out.println(maxLen);
        }
    }
}
