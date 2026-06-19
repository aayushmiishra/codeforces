import java.util.*;

public class D{
    static boolean isPalindrome(int[] a, int low, int high) {
        while(low<high) {
            if(a[low]!=a[high]) return false;
            low++;
            high--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[2*n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=n;i<2*n;i++) a[i]=a[2*n-1-i];

        int l=0;
        int r=2*n-1;

        if(isPalindrome(a, l, r)) {
            for(int i=0;i<2*n;i++) {
                if(a[i])
            }
        } //else {
        //     System.out.println("Not Palindrome");
        // } 
        sc.close();
    }
}