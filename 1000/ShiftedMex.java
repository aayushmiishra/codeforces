import java.util.Scanner;
import java.util.Arrays;
public class ShiftedMex {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i= 0;i<n;i++) a[i] = sc.nextInt();
            Arrays.sort(a);
            int one=0;
            int two=0;
            for(int i=0;i<n;i++){
                if(i==0||a[i]!=a[i-1]){
                    if(i==0||a[i]!=a[i-1]+1) two=1;
                    else two++;
                    one=Math.max(one,two);
                }
            }
            System.out.println(one);
        }
        sc.close();
    }
}
