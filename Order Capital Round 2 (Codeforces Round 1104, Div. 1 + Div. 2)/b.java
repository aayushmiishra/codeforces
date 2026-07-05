import java.util.*;
public class b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            long ans = 0;
            boolean possible = true;
            for (int i=0;i<n;i++) {
                int j=i;
                while (j < n && a[j] > b[i]) j++;
                if(j==n){
                    possible=false;
                    break;
                }
                while(j>i){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                    ans++;
                    j--;
                }
            }
            System.out.println(possible ? ans : -1);
        } sc.close();
    }
}