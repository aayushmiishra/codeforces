import java.util.Scanner;

public class LineTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int[] stations=new int[n];
            for(int i=0;i<n;i++){
                stations[i]=sc.nextInt();
            }
            int maxDistance=0;
            maxDistance=Math.max(maxDistance, stations[0]);
            for(int i=1;i<n;i++){
                int distance=stations[i]-stations[i-1];
                maxDistance=Math.max(distance,maxDistance);
            }
            int finalDistance=2*(x-stations[n-1]);
            maxDistance=Math.max(finalDistance,maxDistance);
            System.out.println(maxDistance);
        }
        sc.close();
    }
    
}
