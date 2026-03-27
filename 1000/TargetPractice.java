import java.util.*;

public class TargetPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int score = 0;
            for (int i = 0; i < 10; i++) {
                String row = sc.next();
                for (int j = 0; j < 10; j++) {
                    if (row.charAt(j) == 'X') {
                        int d = Math.min(Math.min(i, j), Math.min(9 - i, 9 - j));
                        score += d + 1;
                    }
                }
            }
            System.out.println(score);
        }
        sc.close();
    }
}
