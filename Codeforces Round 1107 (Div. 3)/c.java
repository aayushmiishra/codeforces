import java.util.*;

public class c {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int y=0;
            for(int i=0;i<n-1;i++) if(s.charAt(i)!=s.charAt(i+1)) y++;
            if(y==1) System.out.println(2);
            else System.out.println(1);
        } sc.close();
    }
}
