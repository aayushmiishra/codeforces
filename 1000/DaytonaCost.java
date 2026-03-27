import java.util.Scanner;

public class DaytonaCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] array=new int[n];
            for(int i=0;i<n;i++){
                array[i]=sc.nextInt();
            }
            boolean found=false;
            for(int i=0;i<n;i++){
                if(array[i]==k){
                    found=true;
                    break;
                }
            }
            if(found) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}