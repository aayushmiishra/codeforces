import java.util.*;
public class A {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
        int n=sc.nextInt();
        long[] v=new long[3];
        while(n-->0) {
            int x=sc.nextInt();
            v[x]++;
        }
        long y = Math.abs(v[1] - v[2]);
        y /= 3;
        long minn = Math.min(v[1], v[2]);
        System.out.println(v[0] + minn + y);
    }
}
}