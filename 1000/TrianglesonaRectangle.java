import java.util.Scanner;

public class TrianglesonaRectangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int w=sc.nextInt();
            int h=sc.nextInt();
            
            int k1=sc.nextInt();
            int[] bottom=new int[k1];
            for(int i=0;i<k1;i++) bottom[i]=sc.nextInt();

            int k2=sc.nextInt();
            int[] top=new int[k2];
            for(int i=0;i<k2;i++) top[i]=sc.nextInt();

            int k3=sc.nextInt();
            int[] left=new int[k3];
            for(int i=0;i<k3;i++) left[i]=sc.nextInt();

            int k4=sc.nextInt();
            int[] right=new int[k4];
            for(int i=0;i<k4;i++) right[i]=sc.nextInt();

            long bot=bottom[k1-1]-bottom[0];
            long to=top[k2-1]-top[0];
            long lef=left[k3-1]-left[0];
            long rig=right[k4-1]-right[0];

            long area1=bot*h;
            long area2=to*h;
            long area3=lef*w;
            long area4=rig*w;

            long area=Math.max(Math.max(area1, area2), Math.max(area3, area4));
            System.out.println(area);
        }
        sc.close();
    }
}