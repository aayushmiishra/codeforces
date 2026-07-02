import java.util.*;
public class a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            int idx=0;
            for(int i=0;i<n;i++){
                if(a[i]==n) {
                    idx=i;
                    break;
                }
            }
            int temp=a[0];
            a[0]=a[idx];
            a[idx]=temp;
            for(int i=0;i<n;i++) System.out.print(a[i] + " ");
            System.out.println();
        }
        sc.close();
    }
}