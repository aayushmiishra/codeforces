import java.util.*;
public class KalindromeArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            int left=0, right=a.length-1;
            for(int i=0;i<n;i++){
                if(a[left]==a[right]){
                    left++; right--;
                } else {
                    if(a[left]==a[right-1]) System.out.println("YES");
                    else if(a[left+1]==a[right]) System.out.println("YES");
                }
            }

        }        
                sc.close();
   
        }
    }