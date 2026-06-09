import java.util.*;
public class TheatreSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();

        long value = (long)(Math.ceil((double)m / a) * 
                            Math.ceil((double)n / a));

        System.out.println(value);

        sc.close();
}
}