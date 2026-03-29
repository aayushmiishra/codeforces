import java.util.*;
public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            Arrays.sort(a);
            int count=1;
            boolean found=false;
            for(int i=1;i<n;i++) {
                if(a[i]==a[i-1]) count++;
                else count=1;
                if(count>=3) {
                    System.out.println(a[i]);
                    found=true;
                    break;
                }
            }
            if(!found) System.out.println("-1");
        }
        sc.close();
    }    
}