import java.util.*;
@SuppressWarnings("unused")
public class TheLegendofFreyatheFrog {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int k=sc.nextInt();
            
            int a=(x+k-1)/k;
            int b=(y+k-1)/k;
            int ans=Math.max(2*a-1,2*b);
            
            System.out.println(ans);
        }
        sc.close();
    }
}
