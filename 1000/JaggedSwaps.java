import java.util.Scanner;

public class JaggedSwaps {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] permu=new int[n];
            for(int i=0;i<n;i++){
                permu[i]=sc.nextInt();
            }
            if(permu[0]==1){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
    
}