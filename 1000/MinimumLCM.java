import java.util.Scanner;
public class MinimumLCM{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		long t=scanner.nextLong();
		while (t-- > 0){
			long n=scanner.nextLong(); 
			long a=1;
			long b=n-1;
            for(long i=2;i*i<=n;i++){
				if (n%i==0){
					a=n/i;
					b=n-a;
					break;
				}
			}System.out.println(a+" "+b);
		}
		scanner.close();
	}
}
