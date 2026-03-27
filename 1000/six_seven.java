import java.util.*;
public class six_seven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int see=0;
            int[] a=new int[n];
            for(int i=0;i<n;i++) {
                a[i]=sc.nextInt();
                if(a[i]==67) see++;
            }
            if(see>0) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
    
}
