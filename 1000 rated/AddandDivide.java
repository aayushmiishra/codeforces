import java.util.*;
public class AddandDivide {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long ans=Long.MAX_VALUE;
            for(int k=0;k<=30;k++) {
                long temp=b+k;
                if (temp==1) continue;
                long tempA=a;
                long div=0;
                while (tempA>0){
                    tempA/=temp;
                    div++;
                }
                ans=Math.min(ans,k+div);
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
