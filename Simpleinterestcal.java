import java.util.Scanner;

public class Simpleinterestcal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter principal:");
        int p=sc.nextInt();
        System.out.println("enter rate:");
        int r=sc.nextInt();
        System.out.println("enter time:");
        int t=sc.nextInt();
        int interest=(p*r*t)/100;
        System.out.println("principal:"+p);
        System.out.println("rate:"+r);
        System.out.println("time"+t);
        System.out.println("interest:"+interest);
    }
}
