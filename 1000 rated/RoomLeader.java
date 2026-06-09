import java.util.*;
//@SuppressWarnings("unused")
public class RoomLeader {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int top=-2501;
        String leader="";
        while(n-->0){
            String handle=sc.next();
            int plus=sc.nextInt();
            int minus=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int e=sc.nextInt();
            int points=plus*100-minus*50+a+b+c+d+e;
            if(points>top) {
                leader=handle;
                top=points;
            }
        }
        System.out.println(leader);
        sc.close();
    }
}