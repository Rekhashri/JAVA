package exceptionHandling.example2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    File file = new File("Example.txt");
    
    try {
      Scanner readFile = new Scanner(file);
    } catch (FileNotFoundException e){
     System.out.println("File not found " + file.toString());
    }
    System.out.println("Hello there!");
  }
}
