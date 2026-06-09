import java.util.*;
//@SuppressWarnings("unused")
public class Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int k=sc.nextInt();
            int a1=sc.nextInt();
            int b1=sc.nextInt();
            int a2=sc.nextInt();
            int b2=sc.nextInt();
            
            int a=a1+a2;
            int b=b1+b2;
            if(b+k>a) System.out.println("YES");
            else System.out.println("NO");
            
            //System.out.println(ans);
        }
        sc.close();
    }
}
