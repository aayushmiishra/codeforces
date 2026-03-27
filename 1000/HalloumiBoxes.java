import java.util.*;

public class HalloumiBoxes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] boxes = new int[n];

            for(int i = 0; i < n; i++){
                boxes[i] = sc.nextInt();
            }

            if(k == 1){
                boolean sorted = true;
                for(int i = 1; i < n; i++){
                    if(boxes[i] < boxes[i - 1]){
                        sorted = false;
                        break;
                    }
                }
                if(sorted) System.out.println("YES");
                else System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
