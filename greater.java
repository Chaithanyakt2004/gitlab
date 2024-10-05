import java.util.Scanner;

    public class greater {
    public static void main(String[] args) {
        int numberOne,numberTwo,largest;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number1");
        numberOne=scan.nextInt();
        System.out.println("enter a number2");
        numberTwo =scan.nextInt();
        if(numberOne> numberTwo){
            System.out.println(" greater");
        }else{
            System.out.println(" lesser");
        }
    }

}
