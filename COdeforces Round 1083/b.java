import java.util.*;

public class b {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            long n = sc.nextLong();
            long temp = n;

            long ans = 1;

            for (long i = 2; i * i <= temp; i++) {

                if (temp % i == 0) {

                    ans *= i;

                    while (temp % i == 0) {
                        temp /= i;
                    }
                }
            }

            if (temp > 1) {
                ans *= temp;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}