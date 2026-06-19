import java.util.*;
public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int x=sc.nextInt();
            int y=sc.nextInt();
            // int[] w=new int[n];
            // for(int i=0;i<n;i++) w[i]=sc.nextInt();
            if(x%2!=0 && y%2!=0) {
                System.out.println("NO");
                // continue;
            } else {
                System.out.println("YES");
            }
            // System.out.println(count);
        }sc.close();
    }
}