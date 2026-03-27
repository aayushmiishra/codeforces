import java.util.*;

public class BeautifulArray {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int t=scanner.nextInt(); 
		while(t-->0){
			long n=scanner.nextLong(); 
			long k=scanner.nextLong(); 
			long b=scanner.nextLong(); 
			long s=scanner.nextLong(); 
            if(s<k*b || s>(k*b+n*(k-1))) System.out.println("-1"); 
			else {
				long[] array=new long[(int) n]; 
				array[0]=k*b; 
				s-=k*b; 
                for(int i=0;i<n;i++){
					long c=Math.min(k-1,s);
					array[i]+=c; 
					s-=c; 
				}
				for (int i=0;i<n;i++){
					System.out.print(array[i]+" ");     
				}
				System.out.println();
			}
		}
		scanner.close();
	}

	// Time Complexity (TC): O(n) = O(10^5)
	// Space Complexity (SC): O(n) = O(10^5)
}
