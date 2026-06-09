import java.io.*;
// import java.util.*;
public class dj {
    public static void main(String[] args) throws Exception {

        // 🔹 Input written directly here
        String input = "3\n2\n1\n3\n";

        BufferedReader br = new BufferedReader(new StringReader(input));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            for (int i = 1; i <= n; i++) {
                sb.append(n + 2 * i - 1).append(" ")
                  .append(i).append(" ")
                  .append(n + 2 * i).append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}