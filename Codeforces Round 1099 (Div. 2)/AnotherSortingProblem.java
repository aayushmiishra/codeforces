import java.util.*;
public class AnotherSortingProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt();
            long[] a=new long[n];
            for(int i=0;i<n;i++) a[i]=sc.nextLong();
            long k=0;
            for(int i=0;i<n-1;i++) if(a[i]>a[i+1]) k=Math.max(k,a[i]-a[i+1]);
            boolean ans=false;
            for(int start=0;start<=1;start++){
                int[] b=new int[n];
                b[0]=start;
                boolean ok=true;
                for(int i=0;i<n-1;i++){
                    long cur=a[i]+b[i]*k;
                    if (cur<=a[i+1]) b[i+1]=0;
                    else if(cur<=a[i+1]+k)b[i+1]=1;
                    else{ok=false;break;}
                }
                if(ok){ans=true; break; }
            }
            System.out.println(ans ? "YES" : "NO");
        }
        sc.close();
    }
}