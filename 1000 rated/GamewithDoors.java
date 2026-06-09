import java.util.*;

public class GamewithDoors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {

            int l = sc.nextInt();
            int r = sc.nextInt();
            int L = sc.nextInt();
            int R = sc.nextInt();

            int left = Math.max(l, L);
            int right = Math.min(r, R);

            if (left > right) {
                System.out.println(1);
            } else {
                int ans = right - left;
                if (l != L) ans++;
                if (r != R) ans++;
                System.out.println(ans);
            }
        }
        sc.close();
    }
}