import java.util.*;

public class NumbersonWhiteBoard {

    static int ceilAvg(int a, int b) {
        return (a + b + 1) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            System.out.println(2);

            int cur = n;

            for (int i = n - 1; i >= 1; i--) {
                System.out.println(cur + " " + i);
                cur = ceilAvg(cur, i);
            }
        }

        sc.close();
    }
}