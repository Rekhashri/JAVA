package interfaces;

public class vehicle implements information{

  private String type;

  public vehicle(String type){
    this.type = type;
  }

  public void drive(){
    System.out.println("Driving the vehicle");
  }

  public void displayInformation(){
    System.out.println("vehicle type is :"+type);
  }
}
