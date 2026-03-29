
import java.util.*;
public class D {
    static void solve(Scanner sc) {
        int n=sc.nextInt();
        String s=sc.next();
        int i=0;
        while(i<n){
            if(s.charAt(i)=='W'){
                i++;
                continue;
            }
            int j=i;
            boolean hasR=false,hasB=false;
            while(j<n&&s.charAt(j)!='W'){
                if(s.charAt(j)=='R') hasR=true;
                if (s.charAt(j) == 'B') hasB=true;
                j++;
            }
            if(!(hasR&&hasB)){
                System.out.println("NO");
                return;
            }
            i=j;
        }
        System.out.println("YES");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) solve(sc);
        sc.close();
    }
}