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
    class singleparot extends Parot{
         void sing(){
            System.out.println("i can sing");
         }
    }
    public class Main1{
        public static void main(String[] args) {
       singleparot p=new singleparot();
       p.color();
       p.fly();
       p.sing();
   }
}