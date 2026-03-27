import java.util.*;
public class ShoeShuffling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long[] nums=new long[n];
            for(int i=0;i<n;i++) nums[i]=sc.nextLong();
            ArrayList<long[]> freq=new ArrayList<>();
            long curr=nums[0];
            int count=1;
            for(int i=1;i<n;i++){
                if(nums[i]==curr) count++;
                else {
                    freq.add(new long[]{curr, count});
                    curr = nums[i];
                    count = 1;
                }
            }

            freq.add(new long[]{curr, count});

            boolean check = true;

            for (int i = 0; i < freq.size(); i++) {
                if (freq.get(i)[1] == 1) {
                    check = false;
                    break;
                }
            }

            if (!check) {
                System.out.println(-1);
            } else {
                int till = 0;

                for (int i = 0; i < freq.size(); i++) {
                    int blockSize = (int) freq.get(i)[1];

                    System.out.print((blockSize + till) + " ");

                    int temp = till + 1;

                    for (int j = 0; j < blockSize - 1; j++) {
                        System.out.print(temp + " ");
                        temp++;
                    }

                    till += blockSize;
                }

                System.out.println();
            }
        }

        sc.close();
    }
}
