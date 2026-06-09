import java.util.*;

public class MickeyMouseConstructive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int res = (x == y) ? 1 : Math.abs(x - y);
            System.out.println(res);

            if (x == y) {
                for (int i = 0; i < x; i++) {
                    System.out.print("1 -1 ");
                }
            } else if (x > y) {
                for (int i = 0; i < x; i++) System.out.print("1 ");
                for (int i = 0; i < y; i++) System.out.print("-1 ");
            } else {
                for (int i = 0; i < y; i++) System.out.print("-1 ");
                for (int i = 0; i < x; i++) System.out.print("1 ");
            }

            System.out.println();
        }

        sc.close();
    }
}