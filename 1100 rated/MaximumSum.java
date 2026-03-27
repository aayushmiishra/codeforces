import java.util.*;
public class MaximumSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            int left=0, right=left+1;
            int k_checker=k,sumer=0;
            int sum=0;
            for(int i=0;i<n;i++) sum+=a[i];
            while(left<right && k_checker>0){
                Arrays.sort(a);
                sumer=Math.max(a[left]+a[right], a[n-1]);
                sum-=sumer;
                k_checker--;
            }      System.out.println(sum);      
        }
        sc.close();
    }
    
}
