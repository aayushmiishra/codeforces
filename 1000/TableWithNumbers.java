import java.util.*;

public class TableWithNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int h = sc.nextInt();
            int l = sc.nextInt();
            
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
             int both = 0;      // Elements that can be used as both row and column (≤ min(h,l))
            int onlyRow = 0;   // Elements that can only be used as row (min(h,l) < x ≤ h)
            int onlyCol = 0;   // Elements that can only be used as column (min(h,l) < x ≤ l)
            
            int minDim = Math.min(h, l);
            int maxDim = Math.max(h, l);
            
            for (int i = 0; i < n; i++) {
                if (a[i] <= minDim) {
                    both++;
                } else if (a[i] <= h && h > l) {
                    onlyRow++;
                } else if (a[i] <= l && l > h) {
                    onlyCol++;
                }
                // Elements > max(h, l) are useless
            }
            
            // Strategy to maximize valid pairs:
            // 1. Pair onlyRow with onlyCol (each creates 1 valid pair)
            // 2. Pair remaining onlyRow with both (both acts as column)
            // 3. Pair remaining onlyCol with both (both acts as row)
            // 4. Pair remaining both elements with each other
            
            int validPairs = 0;
            
            // Pair onlyRow with onlyCol
            int mixed = Math.min(onlyRow, onlyCol);
            validPairs += mixed;
            onlyRow -= mixed;
            onlyCol -= mixed;
            
            // Pair remaining onlyRow with both
            int rowWithBoth = Math.min(onlyRow, both);
            validPairs += rowWithBoth;
            both -= rowWithBoth;
            
            // Pair remaining onlyCol with both
            int colWithBoth = Math.min(onlyCol, both);
            validPairs += colWithBoth;
            both -= colWithBoth;
            
            // Pair remaining both elements with each other
            validPairs += both / 2;
            
            System.out.println(validPairs);
        }
        
        sc.close();
    }
}