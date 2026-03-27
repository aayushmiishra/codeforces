import java.util.Scanner;
public class TheCurseOftheFrog {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long x=sc.nextLong();
            long maxa=0;
            long check=Long.MIN_VALUE;
            for(int i=0;i<n;i++) {
                long a=sc.nextLong();
                long b=sc.nextLong();
                long c=sc.nextLong();
                maxa=Math.max(maxa, a);
                check=Math.max(check, a*b-c);
            }if (maxa>=x) {
                System.out.println(0);
                continue;
            }if (check<=0) {
                System.out.println(-1);
                continue;
            }long trys=x-maxa;
            long rollback=(trys+check-1)/check;
            System.out.println(rollback);
        }
        sc.close();
    }
}