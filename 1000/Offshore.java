import java.util.*;
public class Offshore {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int[] rubles=new int[n];
            int sum=0;
            for(int i=0;i<n;i++) rubles[i]=sc.nextInt();
            if(x==y){
                for(int i=0;i<n;i++) sum+=rubles[i];
                System.out.println(sum);
            }
            else if(x>y){
                for(int i=0;i<n;i++) sum+=(rubles[i]/x)*y;
                
                
            }
        }        
    }
}
