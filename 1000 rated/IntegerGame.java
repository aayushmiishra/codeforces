import java.util.*;
public class IntegerGame {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(); //number of testcases
        while(t-->0){
            int n=sc.nextInt(); //current integer            
            
            if(n%3!=0){
                System.out.println("First");
            } else{
                System.out.println("Second");
            }
        }
        sc.close();
    }
}

