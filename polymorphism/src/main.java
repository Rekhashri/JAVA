package polymorphism.src;

public class main {
  public static void main(String[] args) {
    
  vehicle vehicle1 = new vehicle();
  car car1 = new car();

  vehicle vehicle2 = car1;
  vehicle2.design();
  car1.ride();
  //vehicle2.ride()     It shows error
  
  createDesign(car1);
  }

  public  static void createDesign( vehicle Vehicle){
    Vehicle.design();
  }
}
