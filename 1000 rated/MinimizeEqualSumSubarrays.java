import java.util.*;
public class MinimizeEqualSumSubarrays {
    @SuppressWarnings("unused")
    static void rotate(int[] arr) {
        int last=arr[arr.length - 1];
        for (int i=arr.length-1;i>0;i--) arr[i]=arr[i-1];
        arr[0]=last;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] p=new int[n];
            for(int i=0;i<n;i++) p[i]=sc.nextInt();
            rotate(p);
            for(int i=0;i<n;i++){
                System.out.print(p[i]);
                if(i<n-1) System.out.print(" ");
            }
            System.out.println();
            }
        sc.close();
    }
}
