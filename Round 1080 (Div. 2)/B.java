import java.util.*;
public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] p=new int[n+1];
            for(int i=1;i<=n;i++) p[i]=sc.nextInt();
            int[] marked=new int[n+2];
            for(int i=1;i<=n;i++) marked[i]=marked[i-1]+(p[i]<=i?1:0);

            int count=marked[n];
            for(int d=1;d<=n;d++){
                if(p[d]>d){
                    int check=marked[d-1]+1+(marked[p[d]-1]-marked[d]);
                    count=Math.max(count, check);
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
