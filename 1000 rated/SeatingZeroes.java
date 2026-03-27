import java.util.*;

public class SeatingZeroes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int ones=0;
            for(char c:s.toCharArray()) if (c=='1') ones++;
            if(ones==0){
                System.out.println((n + 1) / 2);
                continue;
            } 
            for(int i=0;i<n;){
                if(s.charAt(i)=='1'){
                    i+=2;
                    continue;
                } if(i+2<n && s.charAt(i)=='0' && s.charAt(i + 1)=='0' && s.charAt(i+2)=='0'){
                    boolean left=(i-1>=0 && s.charAt(i-1)=='1');
                    boolean right=(i+3<n && s.charAt(i + 3)=='1');
                    if(!left && !right){
                        ones++;
                        i+=3;
                        continue;
                    }
                }
                i++;
            }
            System.out.println(ones);
        }
    }
}
