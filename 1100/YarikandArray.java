import java.util.*;
public class YarikandArray   {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            int res=a[0];
            int curr=a[0];
            for(int i=1;i<n;i++){
                if(Math.abs(a[i-1]%2)!=Math.abs(a[i]%2)) curr=Math.max(a[i], curr+a[i]);
                else curr=a[i];
                res=Math.max(res, curr);
                
            }
            System.out.println(res);
        }
        sc.close();
    }
}
