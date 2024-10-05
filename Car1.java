class Car1 {
     private String modelName;
     private String owner;
     private int regnumber;

     public Car1(String modelName,String owner,int regnumber) {
           this.modelName = modelName;
           this.owner = owner;
           this.regnumber = regnumber;
     }
     
     public void startEngine(){
        System.out.println("car be started..");
     }
     public void accelerate(){
        System.out.println("car can be accelerated");
     }
     public void stop(){
        System.out.println("car can be stopped..");
     }
     public void showcarInformation(){
      System.out.println("the car is owned by "  + owner);
      System.out.println("the car model is " +modelName);
      System.out.println("the regnumber is " +regnumber);
     }
     //main method
     public static void main(String[] var0){
      Car1 myCar = new Car1( "Suzuki", "xyz", 1234);
      myCar.startEngine();
      myCar.accelerate();
      myCar.stop();

      myCar.showcarInformation();

     }
    
}
