import java.util.*;
public class FairNumbers {
	private static boolean isFair(int n) {
		int num=n;
		while(num!=0){
			int x=num%10;
			if(x!=0&&n%x!=0) return false;
			num/=10;
		}
		return true; 
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt(); 
			while (!isFair(n)) n+=1;
			System.out.println(n); 
		}
		sc.close();
	}
}
