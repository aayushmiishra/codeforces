import java.util.*;
public class GamewithaFraction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();        
        while(t-->0){
            long p=sc.nextLong();
            long q=sc.nextLong();
            if(p>=q) System.out.println("Alice");
            else if(3*p>=2*q) System.out.println("Bob");
            else System.out.println("Alice");
        }
        sc.close();
    }
}

