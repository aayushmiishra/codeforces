import java.util.*;

public class ArrayMerging {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];
            // int[] c=new int[2*n];
            for (int i=0;i<n;i++) {
                a[i]=sc.nextInt();
                b[i]=sc.nextInt();
            }
            int[] travA=new int[2*n+1];
            int[] travB=new int[2*n+1];
            int i = 0;
            while (i < n) {
                int val = a[i];
                int cnt = 0;

                while (i < n && a[i] == val) {
                    cnt++;
                    i++;
                }

                travA[val] = Math.max(travA[val], cnt);
            }
            i = 0;
            while (i < n) {
                int val = b[i];
                int cnt = 0;

                while (i < n && b[i] == val) {
                    cnt++;
                    i++;
                }

                travB[val] = Math.max(travB[val], cnt);
            }
            int ans = 0;

            for (int val = 1; val <= 2 * n; val++) {
                ans = Math.max(ans, travA[val] + travB[val]);
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
