public class Swapnumbers {
    public static void main(String[] args) {
        int x=10,y=20;
        System.out.println("before swap");
        System.out.println("x:"+x);
        System.out.println("y:"+y);
        int temp=x;
        x=y;
        y=temp;
        System.out.println("After swap");
        System.out.println("x:"+x);
        System.out.println("y:"+y);
    }
}
