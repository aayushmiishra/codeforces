import java.util.*;
public class BasketballTogether {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long d=sc.nextLong();
		long[] array=new long[(int) n];
		for(int i=0;i<n;i++) array[i]=sc.nextLong();
		Arrays.sort(array); 
		long low=-1; 
		long high=n-1;
		long size=1;
		long count=0;
		while(low<high){
			if((array[(int) high]*size)<=d && low<high){
				low++;
				size++;
			} else {
				count++;
				high--;
				size=1;
			}
		}
		System.out.println(count);
		sc.close();
	}
}