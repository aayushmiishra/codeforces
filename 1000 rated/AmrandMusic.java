import java.util.*;
public class AmrandMusic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[][] days=new int[n][2];
        for(int i=0;i<n;i++){
            days[i][0]=sc.nextInt(); 
            days[i][1]=i+1;
        }
        Arrays.sort(days,(a,b)->a[0]-b[0]);
        ArrayList<Integer> ans=new ArrayList<>();
        int sum=0;
        for(int i=0;i<n;i++){
            if(sum+days[i][0]<=k){
                sum+=days[i][0];
                ans.add(days[i][1]);
            } else break;
        }
        System.out.println(ans.size());
        for (int x : ans) System.out.print(x + " ");
        sc.close();
    }
}