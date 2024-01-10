import java.util.Scanner;
public class testSwitchStatement {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your instruction: ");
    String text = input.nextLine();

    //variable types supported by switch statements: char, byte, short, int and string

    switch(text) {
      case "Run":
        System.out.println("Program is running");
        break;
       case "stop":
         System.out.println("Program stopped");
         break;
       default:
         System.out.println("These instruction not allowed  ");
           
    }
  }
}
