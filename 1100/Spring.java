import java.util.*;
public class Spring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();
            long m=sc.nextLong();

            long count_a=m/a;
            long count_b=m/b;
            long count_c=m/c;
            long count_ab=m/lcm(a,b);
            long count_ac=m/lcm(a,c);
            long count_bc=m/lcm(b,c);
            long count_abc=m/lcm(lcm(a,b),c);
            long alice=6*count_a-3*(count_ab)-3*(count_ac)+2*count_abc;
            long bob=6*count_b-3*(count_ab)-3*(count_bc)+2*count_abc;
            long carol=6*count_c-3*(count_ac)-3*(count_bc)+2*count_abc;

            System.out.println(alice + " " + bob + " " + carol);
            
        }
        sc.close();
    }
    static long gcd(long x,long y){
        return y==0?x:gcd(y,x%y);
    }
    static long lcm(long x,long y){
    return (x/gcd(x,y))*y;
    }
    
}
