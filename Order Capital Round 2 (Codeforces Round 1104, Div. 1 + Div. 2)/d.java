import java.util.*;
public class d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int s=s.length();
            int low=0, high=s.length()-1;
            while(low<high){
                if(s.charAt(low)==s.charAt(high)){
                    s
                    low++;
                    high--;
                } else {
                    s++;
                    low++;
                }
            }
    }
        sc.close();
    }
}