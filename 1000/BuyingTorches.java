import java.util.*;
public class BuyingTorches {
	private static long divide(long a, long b) {
		return (a+b-1)/b;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt(); 
		while(t-->0){
			long x=sc.nextLong(); 
			long y=sc.nextLong(); 
			long k=sc.nextLong(); 
			long stickGains=x-1;
			long sticks=k*y+k-1;
			long trades=0;
			trades+=divide(sticks, stickGains);
			trades+=k;
			System.out.println(trades);
		}
		sc.close();
	}
}