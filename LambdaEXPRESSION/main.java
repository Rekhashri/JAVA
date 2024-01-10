package LambdaEXPRESSION;

interface FunctionInterface {
  void start();
}

class Car{
  public void drive(FunctionInterface obj){
    System.out.println("Driving the car..");
    obj.start();
  }
}
public class main {
  public static void main(String[] args) {
    
    Car car = new Car();

    //Anonymous class
    car.drive(new FunctionInterface() {
      public void start(){
        System.out.println("Start driving...");
      }
     
    });
    System.out.println(" ");

    // Lambda expression
    car.drive(() -> {
      System.out.println("start driving...");
      System.out.println("Continue driving...");
  });
      
  }
}
