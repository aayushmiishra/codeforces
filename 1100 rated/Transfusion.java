import java.util.*;

public class Transfusion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long[] a = new long[n];
            long sum = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                sum += a[i];
            }

            if (sum % n != 0) {
                System.out.println("NO");
                continue;
            }

            long target = sum / n;

            long oddSum = 0;
            long evenSum = 0;

            int oddCount = 0;
            int evenCount = 0;

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    oddSum += a[i];
                    oddCount++;
                } else {
                    evenSum += a[i];
                    evenCount++;
                }
            }

            if (oddSum == oddCount * target &&
                evenSum == evenCount * target) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}