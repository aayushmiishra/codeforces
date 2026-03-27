import java.util.Scanner;

public class SkiResort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int q = sc.nextInt();

            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }

            long ways = 0;
            int count = 0;

            for (int i = 0; i < n; i++) {
                if (array[i] <= q) {
                    count++;
                    if (count >= k) {
                        ways += (count - k + 1);
                    }
                } else {
                    count = 0;
                }
            }

            System.out.println(ways);
        }
        sc.close();
    }
}
