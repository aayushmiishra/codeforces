import java.util.*;
@SuppressWarnings("unused")
public class a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] c=new int[n];
            for(int i=0;i<n;i++) c[i]=sc.nextInt();
            int freq=0; boolean modi=false;
            for(int i=0;i<n;i++){
                if(c[i]>=3) modi=true;
                if(c[i]==2) freq++;
                
            }
            if(modi || freq>=2) System.out.println("YES");
            else System.out.println("NO");

        }
        sc.close();
    }
}