package interfaces;

public class main {
  public static void main(String[] args) {
    
    computer computer1 = new computer();
    computer1.start();

    vehicle vehicle1 = new vehicle("car");
    vehicle1.drive();

    information info = new computer();
    info.displayInformation();;

    information info1 = vehicle1;
    info1.displayInformation();

    System.out.println();

    showInformation(computer1);
    showInformation(vehicle1);
  }
  private static void showInformation(information info){
    info.displayInformation();
  }
}
