import java.util.*;
public class sixsevenInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            if(x==67) System.out.println(67);
            else System.out.println(x + 1);
            
        }
        sc.close();
    }
}