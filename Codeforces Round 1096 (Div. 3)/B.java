import java.util.*;
public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt();
            String s=sc.next();
            int count1=0, count2=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='(') {
                    count1++;
                } else if(s.charAt(i)==')') {
                    count2++;
                }
            }
            if(count1!=count2) {
                System.out.println("NO");
                // continue;
            } else {
                System.out.println("YES");
            }
        }sc.close();
    }
}