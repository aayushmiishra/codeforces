import java.util.Scanner;

public class JohnnyAncientComputer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            if(a==b){
                System.out.println(0);
                continue;
            }
            int ea=0,eb=0;
            long tempA = a;
            while (tempA % 2 == 0) {
                tempA /= 2;
                ea++;
            }
            long tempB = b;
            while (tempB % 2 == 0) {
                tempB /= 2;
                eb++;
            }
            if (tempA != tempB) {
                System.out.println(-1);
                continue;
            }
            int diff = Math.abs(ea - eb);
            int operations = (diff + 2) / 3; 
            System.out.println(operations);
        }

        sc.close();
    }
}
