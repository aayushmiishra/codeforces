import java.util.*;
public class B{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            char[] arr=s.toCharArray();
            int i=0;
            while(i<k) {
                int count=0;
                for(int j=i;j<n;j+=k) if(arr[j]=='1') count++;

                if(count%2!=0){
                    System.out.println("NO");
                    break;
                }
                i++;
            }
            if(i==k) System.out.println("YES");
        }
        sc.close();
    }
}