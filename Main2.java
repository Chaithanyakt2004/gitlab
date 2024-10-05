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
class cow extends bird{
    void whatcoloriam(){
        System.out.println("i am black");
    }
}
public class Main2{
    public static void main(String[] args) {
   Parot p=new Parot();
   cow s=new cow();
   s.whatcoloriam();
   p.fly();
   
   p.color();
   s.fly();
}
}