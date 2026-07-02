import java.util.*;
public class a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<m;i++) a[i]=sc.nextInt();
            // boolean sub=true;
            for(int i=0;i<m;i++){
                if((a[m]-a[1])==m-1) System.out.println(n-a[m]);
                else System.out.println(1);
            } 
        }
        sc.close();
    }
}