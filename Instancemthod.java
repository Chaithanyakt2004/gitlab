public class Instancemthod {
    public void Display(String name){
       System.out.println("Name: "+ name);
    }
    public static void main(String[] args) {
       Instancemthod a = new Instancemthod();
       a.Display("Hi");

    }
}
