import java.util.*;
public class B {
	public static void B (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int x=sc.nextInt();
			Integer[] a=new Integer[n];
			for(int i=0;i<n;i++) a[i]=sc.nextInt();

			Arrays.sort(a, Collections.reverseOrder());
			int teams=0;
			int size=0;
			for(int i=0;i<n;i++) {
				size++;
				if(size*a[i]>=x) {
					teams++;
					size=0;
				}
			}

			System.out.println(teams);
		}

		sc.close();
	}
}
