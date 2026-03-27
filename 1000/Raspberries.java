import java.util.*;
public class Raspberries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- > 0){
			int n=sc.nextInt(); 
			int k=sc.nextInt(); 
			int[] a=new int[n];
			for(int i=0;i<n;i++) a[i]=sc.nextInt(); 
			int div=k;
			int even=0;
			for(int i=0;i<n;i++){
				if(a[i]%2==0) even++;
				if(a[i]%k==0) div=0;
				div=Math.min(div,(k-a[i]%k));
			}
			if(k==4){
                if(even>=2) div=Math.min(div, 0);
                else if(even==1) div=Math.min(div, 1); 
                else div=Math.min(div, 2);
            }
			System.out.println(div); 
		}
		sc.close();
    }
}