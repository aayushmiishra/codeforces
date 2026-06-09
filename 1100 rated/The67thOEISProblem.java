import java.util.*;
import java.io.*;

public class The67thOEISProblem{
    public static void main(String[] args) throws IOException {
        List<Long> primes = new ArrayList<>();
        for (long num = 2; primes.size() < 10002; num++) {
            boolean ok = true;
            for (long p : primes) {
                if (p * p > num) break;
                if (num % p == 0) { ok = false; break; }
            }
            if (ok) primes.add(num);
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            for (int i = 0; i < n; i++) {
                if (i > 0) sb.append(' ');
                sb.append(primes.get(i) * primes.get(i + 1));
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}