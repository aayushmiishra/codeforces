import java.util.*;
public class ParkourDesign {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long x=sc.nextLong();
            long y=sc.nextLong();
            if((x+y)%3==0 && Math.abs(y)<=(x+y)/3) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
     }
}
