    import java.util.*;
    //@SuppressWarnings("unused")
    public class Game {
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int t=sc.nextInt();
                while(t-->0){
                    int n=sc.nextInt();
                    int[] a=new int[n];
                    for(int i=0;i<n;i++){
                        a[i]=2*(i+1)-1;
                    }            
                    StringBuilder sb=new StringBuilder();
                    for(int i=0;i<n;i++){
                    if(i>0) sb.append(" ");
                    sb.append(a[i]);
                }
                System.out.println(sb);
                }
                sc.close();
        }
    }
