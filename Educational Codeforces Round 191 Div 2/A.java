import java.util.*;
public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            long n=sc.nextLong();
            long x=sc.nextLong();
            long y=sc.nextLong();
            long z=sc.nextLong();
            
            long withoutAI=(n+(x+y)-1)/(x+y);
            long withAI;
            if(z*x>=n) withAI=z;
            else{
                long extra=((n-z*x)+(x+10*y)-1)/(x+10*y);
                withAI=z+extra;
            }
            System.out.println(Math.min(withoutAI, withAI));
        }sc.close();
    }
}