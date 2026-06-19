import java.util.*;
public class check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();

            if (n == 10) {
                System.out.println(-1);
                continue;
            }

            long a = n % 12;
            long b = n - a;

            System.out.println(a + " " + b);
        } sc.close();   
    }
}