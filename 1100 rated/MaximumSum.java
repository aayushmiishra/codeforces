import java.util.*;
public class MaximumSum {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            long[] a=new long[n];
            for(int i=0;i<n;i++) a[i]=sc.nextLong();
            int left=0, high=left+1;
            long sub=0;
            long sum=0;
            for(int i=0;i<n;i++) sum+=a[i];
            Arrays.sort(a);
            while(k>0){
                Arrays.sort(a);
                sub=Math.min(a[left]+a[high], a[n-1]);
                sum-=sub;
                k--;
                left+=2;high+=2;
            }      System.out.println(sum);      
        }
        sc.close();
    }    
}
