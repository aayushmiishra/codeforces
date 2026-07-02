import java.util.*;

public class d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long[] a=new long[n];
            long[] b=new long[n];
            for(int i=0;i<n;i++) a[i]=sc.nextLong();

            for(int i=0;i<n;i++) b[i]=sc.nextLong();

            for(int i=0;i<n;i++){
                if(a[i]>b[i]) break;
                long temp=b[i]-a[i];
                a[i]+=temp;
                if(i<n-1) {
                    a[i+1]-=temp;
                }
            }
            boolean eq=true;
            for(int i=0;i<n;i++){
                if(a[i]!=b[i]){
                    eq=false;
                    break;
                }
            }

            System.out.println(eq ? "YES" : "NO");
        } sc.close();
    }
}