import java.util.*;
@SuppressWarnings("unused")
public class b {
    static boolean left(int[] c, int low, int high){
        int ones=0, rest=0;
        for(int i=low;i<=high;i++){
            if(c[i]==1) ones++;
            else rest++;
        }
        return ones>=rest;
    } static boolean middo(int[] c, int low, int high){
        int ones_twos=0, threes=0;
        for(int i=low;i<=high;i++){
            if(c[i]==3) threes++;
            else ones_twos++;
        }
        return ones_twos>=threes;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] c=new int[n];
            for(int i=0;i<n;i++) c[i]=sc.nextInt();
            int freq=0; boolean modi=false;
            for(int i=0;i<n-2;i++){
                if(!left(c,0,i)) continue;
                for(int j=i+1;j<n-1;j++){
                    // if(!middo(c,i+1,j)) continue;
                    if(middo(c,i+1,j)){
                        modi=true;
                        break;
                    }
                }
                if(modi) break;
                
            }
            if(modi) System.out.println("YES");
            else System.out.println("NO");

        }
        sc.close();
    }
}