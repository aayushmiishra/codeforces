import java.util.*;
public class MoveFolders {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int count=0;
            int moves=0;
            String s=sc.next();
            for(int i=0;i<n;i++){
				if(s.charAt(i)==')')count--;
                else count++; 
				if(count<0){
					moves++; 
					count=0;
				}
			}

			System.out.println(moves);

        }
        sc.close();
    }
}
