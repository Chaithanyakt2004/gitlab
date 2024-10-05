import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner Scanner =new Scanner(System.in);
        System.out.println("enter a year:");
        int year=Scanner.nextInt();

        if((year%4==0)||(year%4==0)&&(year%100!=0)){
            System.out.println("Leapyear");
        }
        else{
            System.out.println("Not Leapyear");
        }
    }
}
