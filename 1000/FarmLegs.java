import java.util.*;
public class FarmLegs {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(); //number of testcases
        while(t-->0){
            int n=sc.nextInt(); //current integer            
            
            if(n%2!=0){
                System.out.println(0);
            } else{
                int a=(n/4)+1;
                System.out.println(a);
            }
        }
        sc.close();
    }
}

