import java.util.*;
public class StringTask{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        s=s.toLowerCase();
        String vowels="aoyeui";
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()) if(vowels.indexOf(ch)==-1) sb.append('.').append(ch);
        System.out.println(sb);

    sc.close();}
}