import java.util.*;
public class CardGame {
    public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a1=sc.nextInt();
            int a2=sc.nextInt();
            int b1=sc.nextInt();
            int b2=sc.nextInt();
            int[] a = {a1, a2};
int[] b = {b1, b2};

int count = 0;

for(int i = 0; i < 2; i++) {
    for(int j = 0; j < 2; j++) {

        int suneet = 0;
        int slavic = 0;

        if(a[i] > b[j]) suneet++;
        else if(a[i] < b[j]) slavic++;

        if(a[1-i] > b[1-j]) suneet++;
        else if(a[1-i] < b[1-j]) slavic++;

        if(suneet > slavic) count++;
    }
}

System.out.println(count);
        }
        sc.close();
    }
}
