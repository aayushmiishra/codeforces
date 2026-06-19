import java.util.*;

public class a {
    public static void a(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[k];
            for (int i = 0; i < k; i++) {
                a[i] = sc.nextInt();
            }

            int[] b = new int[n];

            List<Integer> ops = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();

                int moves = (k + 1) - b[i];

                for (int j = 0; j < moves; j++) {
                    ops.add(i + 1);
                }
            }

            System.out.println(ops.size());

            if (ops.size() > 0) {
                for (int x : ops) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        } sc.close();
    }
}   