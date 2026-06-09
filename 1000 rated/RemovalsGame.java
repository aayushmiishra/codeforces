import java.io.*;
import java.util.*;

public class RemovalsGame {

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;
            while ((c = read()) <= ' ') ;
            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }
            int val = 0;
            while (c > ' ') {
                val = val * 10 + c - '0';
                c = read();
            }
            return val * sign;
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        StringBuilder ans = new StringBuilder();

        int t = fs.nextInt();

        while (t-- > 0) {
            int n = fs.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) a[i] = fs.nextInt();
            for (int i = 0; i < n; i++) b[i] = fs.nextInt();

            boolean same = true;
            boolean rev = true;

            for (int i = 0; i < n; i++) {
                if (a[i] != b[i]) same = false;
                if (a[i] != b[n - 1 - i]) rev = false;
            }

            ans.append((same || rev) ? "Bob" : "Alice").append('\n');
        }

        System.out.print(ans);
    }
}