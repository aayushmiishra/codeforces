import java.util.*;
public class ReplaceandSum{
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        StringBuilder out=new StringBuilder();
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int q=sc.nextInt();
            int[] a=new int[n + 1];
            int[] b=new int[n + 1];
            for(int i=1;i<=n;i++) a[i]=sc.nextInt();
            for(int i=1;i<=n;i++) b[i]=sc.nextInt();
            
            while (q-- > 0) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                long ans = 0;
                int maxA = 0;
                for (int i = r; i >= l; i--) {
                    maxA = Math.max(maxA, a[i]);
                    ans += Math.max(b[i], maxA);
                }
                out.append(ans).append(' ');
            }
            out.append('\n');
        }
        System.out.print(out.toString());
    }
}