import java.util.Scanner;
public class testArray {
  public static void main(String[] args) {
    int[] numbers = new int[5];
    // int[] numbers = {15,20,25,35,45};
    numbers[0]=15;
    numbers[1]=20;
    numbers[2]=25;
    numbers[3]=35;
    numbers[4]=45;
    System.out.println(numbers[0]);
    System.out.println(numbers[1]);
    System.out.println(numbers[2]);
    System.out.println(numbers[3]);
    System.out.println(numbers[4]);

    for(int i=0; i<numbers.length; i++)
    {
      System.out.println(numbers[i]);
    }
  }
}
