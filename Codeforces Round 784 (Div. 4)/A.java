import java.util.*;
public class A {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
		while(t-->0){
            int rating=sc.nextInt();
            if(rating<=1399) System.out.println("Division 4");
            else if(rating<=1599) System.out.println("Division 3");
            else if(rating<=1899) System.out.println("Division 2");
            else System.out.println("Division 1");
        }
        sc.close();

	}
}
