import java.util.*;
public class AnotherProblemaboutBeautifulPairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        while(t-->0){
            long n=sc.nextLong();            
            long[] array=new long[(int)n];
            for(int i=0;i<n;i++) array[i]=sc.nextLong();
            long count=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    long multi=array[i]*array[j];
                    if(multi+i==j) count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
