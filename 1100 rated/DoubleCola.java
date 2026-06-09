import java.util.*;

public class DoubleCola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        String[] names = {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};

        long blockSize = 1;

        while (n > 5 * blockSize) {
            n -= 5 * blockSize;
            blockSize *= 2;
        }

        int index = (int)((n - 1) / blockSize);
        System.out.println(names[index]);

        sc.close();
    }
}