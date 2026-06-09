import java.util.*;
public class D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long m=sc.nextLong();
            long k=sc.nextLong();
            long low=1, high=m;
            while(low<high){
                long mid=low+(high-low)/2;
                if(n*(mid*(m/(mid+1))+m%(mid+1))>=k) high=mid;
                else low=mid+1;
            } System.out.println(low);
        } sc.close();
    }
}
