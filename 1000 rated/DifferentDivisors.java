import java.util.*;
public class DifferentDivisors{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int d=sc.nextInt();
            int p=d+1;
            while(!isPrime(p)) p++;
            int q=p+d;
            while(!isPrime(q)) q++;
            System.out.println((long)p*q);
            
        }
        sc.close();
    }
    static boolean isPrime(int n) {
    if(n<2) return false;
    if(n==2) return true;
    if(n%2==0) return false;
    for(int i=3;i*i<=n;i+=2){
        if(n%i==0) return false;
    }
    return true;
}
}
