import java.util.Scanner;
public class testDoWhile {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int number = 0;
    do{
      System.out.println("enter a number: ");
      number = input.nextInt();
    }
    while(number != 9);
     System.out.println("YOU GOT 9!");
    }
     
    
  }

