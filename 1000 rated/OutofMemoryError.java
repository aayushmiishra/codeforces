import java.util.Scanner;
public class OutofMemoryError{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int h=sc.nextInt();
            int[] previous=new int[n];
            int[] live=new int[n];
            for(int i=0;i<n;i++){
                previous[i]=sc.nextInt();
                live[i]=previous[i];
            }
            for(int i=0;i<m;i++){
                int b=sc.nextInt()-1;
                int c=sc.nextInt();
                live[b]+=c;
                if(live[b]>h) System.arraycopy(previous,0, live, 0, n);
            }
            for(int i=0;i<n;i++) System.out.print(live[i] + " ");
            System.out.println();
        }

        sc.close();
    }
}
