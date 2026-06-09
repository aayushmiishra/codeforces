import java.util.*;
public class Bar {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();

        int count=0;
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            if(Character.isDigit(s.charAt(0))) {
                int age=Integer.parseInt(s);
                if (age<18) count++;
            } else {
                if (s.equals("ABSINTH") || s.equals("BEER") || s.equals("BRANDY") ||
                    s.equals("CHAMPAGNE") || s.equals("GIN") || s.equals("RUM") ||
                    s.equals("SAKE") || s.equals("TEQUILA") || s.equals("VODKA") ||
                    s.equals("WHISKEY") || s.equals("WINE")) {
                    count++;
                }
            }
        }

        System.out.println(count);
        sc.close();
    }
}