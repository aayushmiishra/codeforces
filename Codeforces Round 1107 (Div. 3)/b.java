import java.util.*;

public class b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long x=sc.nextLong();
            long y=1;
            while(x>=y) y*=10;
            y++;
            System.out.println(y);
        } sc.close();
    }
}
