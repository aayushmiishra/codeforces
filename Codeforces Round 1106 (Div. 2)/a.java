import java.util.*;

public class a {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {

            int n = sc.nextInt();
            int c = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for(int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            int ans = Integer.MAX_VALUE;

            // Case 1 : Without sorting
            boolean possible1 = true;
            int cost1 = 0;

            for(int i = 0; i < n; i++) {

                if(a[i] < b[i]) {
                    possible1 = false;
                    break;
                }

                cost1 += a[i] - b[i];
            }

            if(possible1) {
                ans = Math.min(ans, cost1);
            }

            // Case 2 : With sorting
            Arrays.sort(a);
            Arrays.sort(b);

            boolean possible2 = true;
            int cost2 = c;

            for(int i = 0; i < n; i++) {

                if(a[i] < b[i]) {
                    possible2 = false;
                    break;
                }

                cost2 += a[i] - b[i];
            }

            if(possible2) {
                ans = Math.min(ans, cost2);
            }

            if(ans == Integer.MAX_VALUE) {
                System.out.println(-1);
            }
            else {
                System.out.println(ans);
            }
        }

        sc.close();
    }
}