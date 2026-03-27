import java.util.*;
public class DBMBArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int s=sc.nextInt();
            int x=sc.nextInt();
            int[] a = new int[n];
            int sum=0;
            for(int i=0;i<n;i++) sum += sc.nextInt();
            if(s>=sum && (s-sum)%x==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
