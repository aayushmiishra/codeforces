import java.util.*;

public class Monsters {

    static class Monster {
        int idx;
        int key;

        Monster(int idx, int key) {
            this.idx = idx;
            this.key = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();

            Monster[] monsters = new Monster[n];

            for (int i = 0; i < n; i++) {
                long a = sc.nextLong();
                long rem = a % k;
                if (rem == 0) rem = k;   // important rule
                monsters[i] = new Monster(i + 1, (int) rem);
            }

            Arrays.sort(monsters, (m1, m2) -> {
                if (m1.key != m2.key)
                    return m1.key - m2.key;
                return m1.idx - m2.idx;
            });

            StringBuilder sb = new StringBuilder();
            for (Monster m : monsters) {
                sb.append(m.idx).append(" ");
            }
            System.out.println(sb.toString().trim());
        }

        sc.close();
    }
}
