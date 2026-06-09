import java.util.*;

public class C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            if (n % 2 == 0) {
                System.out.println(-1);
                continue;
            }

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[(2 * i) % n] = i + 1;
            }

            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}