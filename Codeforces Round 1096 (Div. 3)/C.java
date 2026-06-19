import java.util.*;
import java.io.*;

public class C {

    static boolean div2(long x) {
        return x % 2 == 0;
    }

    static boolean div3(long x) {
        return x % 3 == 0;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {

            int n = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());

            List<Long> both = new ArrayList<>();
            List<Long> two = new ArrayList<>();
            List<Long> three = new ArrayList<>();
            List<Long> none = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                long x = Long.parseLong(st.nextToken());

                boolean d2 = div2(x);
                boolean d3 = div3(x);

                if (d2 && d3) both.add(x);
                else if (d2) two.add(x);
                else if (d3) three.add(x);
                else none.add(x);
            }

            List<Long> ans = new ArrayList<>();

            ans.addAll(both);
            ans.addAll(two);
            ans.addAll(none);
            ans.addAll(three);

            for (int i = 0; i < ans.size(); i++) {
                if (i > 0) out.append(" ");
                out.append(ans.get(i));
            }
            out.append("\n");
        }

        System.out.print(out);
    }
}