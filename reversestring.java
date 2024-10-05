import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        String s="chethu";
        String r="";
        for(int i=s.length()-1;i>=0;i--){
        r=r+s.charAt(i);
    }
    System.out.println(s);
    System.out.println(r);
}
}
