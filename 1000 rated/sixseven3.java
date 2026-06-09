import java.util.*;
public class sixseven3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        while(t-->0){
            int n=sc.nextInt();
            int total=3*n;
            for(int i=total;i>=1;i-=3){
                sb.append(i-2).append(" ").append(i).append(" ").append(i-1).append(" ");
            }
                sb.append("\n");
        }
        System.out.print(sb);
        sc.close();
    }
}
