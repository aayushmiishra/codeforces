import java.util.*;
public class FriendlyNumbers {
    public static boolean digitCheck(long a){
        long num=a;
        while(a>0){
            long digit=a%10;
            if(digit!=0 && num%digit!=0) return false;
            a/=10;
        }
        return true;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            while (!digitCheck(n)) n++;
            System.out.println(n);
        }
        sc.close();
    }
}
