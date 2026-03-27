import java.util.*;
public class Offshores{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long x=sc.nextLong(),y=sc.nextLong();
            long[]banks=new long[n];
            for(int i=0;i<n;i++)banks[i]=sc.nextLong();
            long sum=0;
            long[]transfer=new long[n];
            for(int i=0;i<n;i++){
                transfer[i]=(banks[i]/x)*y;
                sum+=transfer[i];
            }
            long totalSum=0;
            for(int i=0;i<n;i++)
                totalSum=Math.max(totalSum,sum-transfer[i]+banks[i]);
            System.out.println(totalSum);
        }
        sc.close();
    }
}
