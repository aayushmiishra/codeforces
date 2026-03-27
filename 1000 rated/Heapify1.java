import java.util.*;
public class Heapify1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                b[i]=a[i];
            }
            Arrays.sort(b);
            int i;
            for(i=0;i<n;i++){
                while(a[i]%2==0) a[i]/=2;
                while(b[i]%2==0) b[i]/=2;
                if(a[i]!=b[i]) {
                    System.out.println("NO");
                    break;
                }
            }

            if (i==n) System.out.println("YES");
        }
        sc.close();
    }
}
