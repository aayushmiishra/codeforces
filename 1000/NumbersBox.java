import java.util.*;
public class NumbersBox{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
			int m=sc.nextInt(); 
            int sum=0;
			long[][] a=new long[n][m];
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					a[i][j] = sc.nextLong(); 
				}
			}
            for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
                    if(a[i][j]<0) a[i][j]*=-1;
                    sum+=a[i][j];
                }
            }
            System.out.println(sum);
        }
        sc.close();
    }
}