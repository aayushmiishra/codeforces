import java.util.Scanner;
public class PrefixMax{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] pre=new int[n];
            for (int i=0;i<n;i++) pre[i]=sc.nextInt();
            int max=0;
            for(int i=0;i<n;i++) max=Math.max(max, pre[i]);
            System.out.println(max*n);
        }
        sc.close();
    }
}
