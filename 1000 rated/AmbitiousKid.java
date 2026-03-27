import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class AmbitiousKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] array=new int[n];
            for(int i=0;i<n;i++){
                array[i]=sc.nextInt();
                array[i]=Math.abs(array[i]);
            }
            Arrays.sort(array);
            System.out.println(array[0]);
        }
        sc.close();
    }
}
