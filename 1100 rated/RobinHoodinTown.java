import java.util.*;

public class RobinHoodinTown {

    static void deez(Scanner sc) {
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        if (n <= 2) {
            System.out.println(-1);
            return;
        }

        long sum = 0;
        for (int x : a) sum += x;

        Arrays.sort(a);

        long req = (long) a[n / 2] * 2 * n + 1;

        if (sum >= req) {
            System.out.println(0);
        } else {
            System.out.println(req - sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            deez(sc);
        }
    }
}