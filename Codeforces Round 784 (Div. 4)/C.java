import java.util.*;

public class C {

    static void solve(Scanner sc) {
        int n = sc.nextInt();

        int odd, even;
        int a = sc.nextInt();
        odd = a % 2;

        a = sc.nextInt();
        even = a % 2;

        boolean f = true;

        for (int i = 1; i <= n - 2; i++) {
            a = sc.nextInt();

            if (i % 2 == 1) {
                if (a % 2 != odd) {
                    f = false;
                }
            } else {
                if (a % 2 != even) {
                    f = false;
                }
            }
        }

        if (f) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }

        sc.close();
    }
}