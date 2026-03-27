import java.util.Scanner;
@SuppressWarnings("unused")
public class RedVersusBlue {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while (t-->0){
			int n=sc.nextInt();
			int r=sc.nextInt();
			int b=sc.nextInt();
			StringBuilder s = new StringBuilder(); 

            int red_bw_blue=r/(b+1);
            int rem_red=r%(b+1);
            for(int i=1;i<=b+1;i++){
                for(int j=1;j<=red_bw_blue;j++) s.append('R');
                if(rem_red>0){
                    s.append('R');
                    rem_red--;
                }
                if (i!=b+1) s.append('B');
            }
            System.out.println(s.toString());
		}
		sc.close();
    }
}
