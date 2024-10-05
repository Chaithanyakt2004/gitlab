class bird {
    void fly(){
          System.out.println("bird can fly");
    }
}
    class Parot extends bird{
        void color(){
            System.out.println("i am green");
        }
    } 
    
    public class Main{
         public static void main(String[] args) {
        Parot p=new Parot();
        p.color();
        p.fly();

    }
    
}
