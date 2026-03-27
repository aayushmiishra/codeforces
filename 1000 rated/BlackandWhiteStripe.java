import java.util.*;
public class BlackandWhiteStripe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            int count=0;
            for(int i=0;i<k;i++){
                if(s.charAt(i)=='W') count++;
            }
            int minCount=count;
            int l=0,r=k;
            while(r<n){
                if(s.charAt(l)=='W') count--;
                if (s.charAt(r)=='W') count++;
                minCount=Math.min(minCount, count);
                l++;
                r++;
            }
            System.out.println(minCount);
        }

        sc.close();
    }
}
