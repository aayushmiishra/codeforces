import java.util.*;
public class Quests {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt(); 
		while (t-->0){
			int n=sc.nextInt(); 
			int k=sc.nextInt();
			int[] a=new int[n]; 
			int[] b=new int[n];
			for(int i=0;i<n;i++) a[i]=sc.nextInt();
			for (int i = 0; i < n; i++) b[i]=sc.nextInt();
			int b_max=0, sum=0; 
			int result = 0;
			for(int i=0;i<Math.min(n,k);i++){
				sum+=a[i];
				b_max=Math.max(b_max, b[i]); 
				result=Math.max(result,sum+(k-(i+1))*b_max); 
			}
			System.out.println(result); 
		}
        sc.close();
    }        
}