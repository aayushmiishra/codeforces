import java.util.*;
public class c{
    static int helper(int a, int b, int x) {
        if(a==b) return 0;
        if(a>b){
            int increment=a-b;
            int divide=1+helper(a/x,b,x);
            return Math.min(increment, divide);
        }
        else{
            int increment=b-a;
            int divide=1+helper(a, b / x, x);
            return Math.min(increment, divide);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int x=sc.nextInt();
            System.out.println(helper(a, b, x));
        }
        sc.close();
    }
}