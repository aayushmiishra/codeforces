import java.util.*;
public class Digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
        long n=sc.nextLong();
        int d=sc.nextInt();
        n=Math.min(n, 6);
        StringBuilder ans=new StringBuilder();
        ans.append("1 ");
        if(d%3==0||n>=3) ans.append("3 "); 
        if(d==5) ans.append("5 ");
        if(d==7||n>=3) ans.append("7 ");
        if(n>=6||(d%3==0&&n>=3)||d==9) ans.append("9 ");
         System.out.println(ans.toString().trim());
        }

        sc.close();
    }
}