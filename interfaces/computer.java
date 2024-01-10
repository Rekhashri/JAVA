package interfaces;
   
public class computer implements information {

  private int serialNumber = 8035;

  public void start(){
    System.out.println("Computer started!");
  }
  
  public void displayInformation(){
    System.out.println("computer serial nuber is :"+ serialNumber);
  }
}
