import java.util.*;
public class DIvisiblePermutation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] nums=new int[n];
            if(n%2==0){
                nums[n-1]=1;
                for(int i=n-2;i>=0;i--){
                    if(i%2==0) nums[i] = nums[i + 1] + (i + 1);
                    else nums[i] = nums[i + 1] - (i + 1);
                }
            } else {
                nums[n - 1] = 1;
                for (int i = n - 2; i >= 0; i--) {
                    if (i % 2 != 0) {
                        nums[i] = nums[i + 1] + (i + 1);
                    } else {
                        nums[i] = nums[i + 1] - (i + 1);
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
