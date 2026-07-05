import java.util.*;
public class c {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long[] a=new long[n];
            for (int i=0;i<n;i++) a[i]=sc.nextLong();
            int i=0;
            while(!sorted(a) && i<a.length-1){
                if(a[i]>a[i+1]){
                    long temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=a[i+1]+temp;
                } i++;
            }
            System.out.println(a[a.length-1]);
        } sc.close();
    }
    public static boolean sorted(long[] a){
        if(a==null || a.length<=1) return true;
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]) return false;
        }
        return true;
    }
}