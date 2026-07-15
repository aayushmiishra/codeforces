import java.util.*;
public class a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int d=sc.nextInt();

            int tower=0, box=1;
            while(n>0){
                if((box-1)*m<=d){
                    box++;
                    n--;
                } else{
                    tower++;
                    box=1;
                }
            }
            System.out.println(tower+1);
        }
        sc.close();
    }
}